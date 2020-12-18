package com.itmo;

import com.itmo.act.Brackets;
import com.itmo.act.Skill;
import com.itmo.being.Born;
import com.itmo.being.Hemuliha;
import com.itmo.being.Kids;
import com.itmo.being.Snusmumrik;
import com.itmo.notalive.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Brackets text = new Brackets() {
            @Override
            public String brackets(String text) {
                return "(" + text + ")";
            }
        };

        Drama drama = new Drama();
        System.out.println(drama.getDescription() + drama.getPremier().getName() + drama.getName());

        Place.Time time = new Place.Time("Пока ");
        Hemuliha hemuliha = new Hemuliha();
        hemuliha.learn(new Skill("угощала "));
        System.out.print(time.getTime() + hemuliha.getDescriptions() + hemuliha.getName() + hemuliha.getSkills().get(0).getName() + hemuliha.getWhoInteractsWith().getName() + hemuliha.getHave().getName() + hemuliha.getWhere().getDescription());

        Place.Time.setTime("только что ");
        Roof whereCling = new Roof("крыше", "которую " + time.getTime() + "просмолили.");
        Poster posters = new Poster(whereCling);

        System.out.println(posters.getDescription() + posters.getName() + posters.continued());

        System.out.println(posters.getPronoun() + posters.planning() + posters.cling());

        Place.Time.setTime("В тот же миг ");
        posters.setName("листок.");
        whereCling.setName("крышу, ");
        posters.setPronoun("его ");

        Snusmumrik snusmumrik = new Snusmumrik(posters);
        snusmumrik.learn(new Skill("разложил "));
        snusmumrik.learn(new Skill("и попытался сложить ", "вместе "));

        Kids kids = new Kids(posters, whereCling, snusmumrik);
        kids.setPronoun("Каждый из них ");
        kids.learn(new Skill("вскарабкались на "));
        kids.learn(new Skill("подобрать ", "чтобы "));
        kids.learn(new Skill("хотел ", "первым "));
        kids.learn(new Skill("вручить "));

        List<Kids> kidsList = new ArrayList<Kids>();
        for (int i = 0; i < 24; i++) {
            kidsList.add(kids);
        }

        System.out.println(Place.Time.getTime() + kidsList.size() + kidsList.get(0).getName() + kidsList.get(0).getSkills().get(0).getName() + kidsList.get(0).getWhereClimbed().getName() + kidsList.get(0).getSkills().get(1).getHow() + kidsList.get(0).getSkills().get(1).getName() + kidsList.get(0).getGiveWhat().getName());
        posters.setPronoun("его ");
        System.out.println(kidsList.get(0).getPronoun(true) + kidsList.get(0).getSkills().get(2).getName() + kidsList.get(0).getSkills().get(2).getHow() + kidsList.get(0).getSkills().get(3).getName() + posters.getPronoun() + kidsList.get(0).getToWhom().getName());

        posters.setDescription("А поскольку ");
        posters.setName("афиша ");
        posters.setPronoun("она ");
        System.out.print(posters.getDescription() + posters.getName() + posters.being());
        posters.setDescription("из из тонкой бумаги ");
        Place.Time.setTime("тотчас ");
        System.out.print(posters.getDescription() + posters.getPronoun() + Place.Time.getTime() + posters.transformation());
        posters.setName("24 клочка ");
        posters.setPronoun("а все, что осталось от нее, ");
        System.out.println(posters.getName() + text.brackets(posters.getPronoun() + posters.falling() + posters.burned()));

        posters.setDescription("смятые ");
        posters.setName("клочки бумаги ");
        posters.setPronoun("то, что осталось от ");
        snusmumrik.setPronoun("Он ");
        snusmumrik.setWhatUses(posters);
        System.out.print(snusmumrik.getPronoun(true) + snusmumrik.getSkills().get(0).getName() + snusmumrik.getWhere().getName() + snusmumrik.getWhatUses().getDescription() + snusmumrik.getWhatUses().getName() + snusmumrik.getSkills().get(1).getName() + snusmumrik.getSkills().get(1).getHow() + snusmumrik.getWhatUses().getPronoun());
        posters.setName("афиши.");
        System.out.println(snusmumrik.getWhatUses().getName());
    }
}
