package com.example.andor.Controler;

import com.example.andor.Enum.TypeMonster;
import com.example.andor.Model.DataLegend;
import com.example.andor.Model.Monster;
import com.example.andor.Model.Section;

import java.lang.reflect.Type;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateLegend {
    public int minSection = 3;
    public int maxSection = 7;


    public DataLegend Generate()
    {
        int randomNum = ThreadLocalRandom.current().nextInt(minSection, maxSection + 1);
        DataLegend DT = new DataLegend();
        int [] ordre = DefineOrdre(randomNum-2);
        int [] tabDiff = DefineIndiceDifficulite(ordre);

        //La section 0 = Situation de départ
        //L'avant dernière section = Situation de final
        //La derniere section = la carte de N

        for(int i =0; i< randomNum;i++)
        {
            if(i == 0)
                DT.sections.add(Creation(TypeSection.Start,65,tabDiff[i]));
            else if(i == randomNum-2)
                DT.sections.add(Creation(TypeSection.Final,ordre[ordre.length-1],tabDiff[i]));
            else if(i == randomNum-1)
                DT.sections.add(Creation(TypeSection.End,78,0));
            else
                DT.sections.add(Creation(TypeSection.Peturbateur,ordre[i-1],tabDiff[i]));
        }

        return DT;
    }


    public Section Creation(TypeSection c, int ordre, int difficulte)
    {
        Section sec = null;
        switch(c)
        {
            case Start:
                sec = CreateStart(ordre,difficulte);
                break;
            case End:
                sec = CreateEnd(ordre,difficulte);
                break;
            case Peturbateur:
                sec = CreatePertubation(ordre,difficulte);
                break;
            case Final:
                sec = CreateFinal(ordre,difficulte);
                break;
        }
        return sec;
    }
    public Section CreateStart(int ordre, int difficute)
    {
        // carte A
        Section secStart = new Section();
        secStart.ordre = ordre;
        //Descriptif

        //Génerer les monstres && Placer monstres
        int minMonster,maxMonster;
        minMonster = 3+difficute/2;
        maxMonster = minMonster+2;
        int nbMonster = ThreadLocalRandom.current().nextInt(minMonster, maxMonster + 1);

        secStart.listMonster = new Monster[nbMonster];
        int i = 0;
        if(difficute>6)
        {
            secStart.listMonster[0] = new Monster(TypeMonster.Troll); //Un troll
            i++;
        }
        for(;i<nbMonster-2;i++)
        {
            //skrall ou gor
            switch(ThreadLocalRandom.current().nextInt(1, 2+ 1))
            {
                case 1:
                    secStart.listMonster[i] = new Monster(TypeMonster.Gor);
                    break;
                case 2:
                    secStart.listMonster[i] = new Monster(TypeMonster.Skrall);
                    break;
            }
        }
        //Placer Joueur

        //Objectif


        return secStart;
    }
    public Section CreateEnd(int ordre, int difficute)
    {
        //Carte N
        Section secEnd = new Section();
        secEnd.ordre = ordre;
        return secEnd;
    }
    public Section CreateFinal(int ordre, int difficute)
    {
        // Carte situation final avec Ordre  > I
        Section secFinal = new Section();
        secFinal.ordre = ordre;
        return secFinal;
    }

    public Section CreatePertubation(int ordre, int difficute)
    {
        // Carte situation final avec Ordre  = I
        Section secPertubation = new Section();
        secPertubation.ordre = ordre;
        return secPertubation;
    }

    public int[] DefineOrdre(int nbOrdre)
    {
        int[] tabOrdre = new int [nbOrdre];
        int minO = 66;
        int maxO = 72;
        for(int i = 0;i<nbOrdre;i++)
        {
            int ordre = ThreadLocalRandom.current().nextInt(minO, maxO + 1-nbOrdre+i);
            tabOrdre[i] =ordre;
            minO = ordre+1;

        }
        tabOrdre[nbOrdre-1] +=1;
        return tabOrdre;
    }
    public int[] DefineIndiceDifficulite(int[] nbOrdre)
    {
        // Plus les evenements sont espacer plus il faut de difficulté
        int [] tabDificulte = new int[nbOrdre.length+1];

        //Case A => nbOrdre[0]
        tabDificulte[0] = nbOrdre[0]-65+2; //=2 ?
        // nbOrdre[n] => nbOrdre[n+1]
        for(int i = 1;i<nbOrdre.length;i++)
        {
            tabDificulte[i]  = nbOrdre[i]-nbOrdre[i-1];
        }
        //nbOrdre[max] => Case N
        tabDificulte[tabDificulte.length-1] = 78-nbOrdre[nbOrdre.length-1];
        return  tabDificulte;
    }
}
enum TypeSection
{
    Start,
    End,
    Peturbateur,
    Final
}
/*
 * 65:A
 * 66:B
 * 67:C
 * 68:D
 * 69:E
 * 70:F
 * 71:G
 * 72:H
 * 73:I
 * 74:J
 * 75:K
 * 76:L
 * 77:M
 * 78:N
 */