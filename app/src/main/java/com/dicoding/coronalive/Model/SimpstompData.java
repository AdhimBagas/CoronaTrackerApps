package com.dicoding.coronalive.Model;

import java.util.ArrayList;

public class SimpstompData {

    public static String [][] dataSymsp = new String[][]{

            {
                    "Sakit Kepala",
                    "https://raw.githubusercontent.com/AdhimBagas/coronaLiveResource/master/headache.png",
                    "Sakit kepala berlebih hingga berhari-hari"
            },
            {
                    "Demam Tinggi",
                    "https://raw.githubusercontent.com/AdhimBagas/coronaLiveResource/master/highFever.png",
                    "Demam tinggi lebih dari 38 derajat celcius"
            },
            {
                    "Sakit Tenggorokan",
                    "https://raw.githubusercontent.com/AdhimBagas/coronaLiveResource/master/soarThroat.png",
                    "Sering mengalami Sakit Tenggorokan"
            },
            {
                    "Batuk Kering",
                    "https://raw.githubusercontent.com/AdhimBagas/coronaLiveResource/master/caugh.png",
                    "Mengalami batuk kering tidak berdahak selama berhari-hari"
            }
    };

    public static ArrayList<Simpstomp> getListDataSimps(){
        Simpstomp simpstomp;
        ArrayList<Simpstomp> list = new ArrayList<>();

        for (String[] mData:dataSymsp){
            simpstomp = new Simpstomp();
            simpstomp.setName(mData[0]);
            simpstomp.setPhoto(mData[1]);
            simpstomp.setDescription(mData[2]);

            list.add(simpstomp);
        }
        return list;
    }
}
