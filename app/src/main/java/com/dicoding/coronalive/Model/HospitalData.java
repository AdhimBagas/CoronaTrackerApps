package com.dicoding.coronalive.Model;

import java.util.ArrayList;

public class HospitalData {

    public static String[][] dataHospital = new String[][]{

            {
                    "RSUD BATANG",
                    "https://raw.githubusercontent.com/AdhimBagas/coronaLiveResource/master/rsudbatang.jpg",
                    "Jl. Dr. Sutomo No. 42, Batang, Jawa Tengah, 51215",
                    "0285-4493035", //telephone
                    "0285-4493033", // ambulance
                    "08112625552",//message
                    "" //url
            },
            {
                    "RS QIM BATANG",
                    "https://raw.githubusercontent.com/AdhimBagas/coronaLiveResource/master/rsQim.jpeg",
                    "Jl. Urip Sumohardjo, Sambong, Batang, Jawa Tengah",
                    "0285 - 4495222",
                    "0285 - 4495222",
                    "085641445458",
                    "https://goo.gl/maps/xgXYrpBE3ZHLL14z5"
            },
            {
                "RSUD Limpung Batang",
                    "https://raw.githubusercontent.com/AdhimBagas/coronaLiveResource/master/rsud_limpung.jpg",
                    "Jl. dr. Soetomo No. 17a Limpung Batang 51271",
                    "(0285) 4468362",
                    "119",
                    "rsudlimpung.batangkab.go.id",
                    "https://goo.gl/maps/T8PPhaj4x9sQjLdX6"
            },
            {
                "Puskesmas Batang I",
                    "https://raw.githubusercontent.com/AdhimBagas/coronaLiveResource/master/puskesmas_batang1.jpeg",
                    "Jl. Dr.Cipto No.34, Proyonanggan Tengah, Kec. Batang, Kabupaten Batang, Jawa Tengah, Indonesia 51216 ",
                    "(0285) 392803",
                    "119",
                    "-",
                    "https://goo.gl/maps/KSiGoHWoBCLRvqf38"
            },
            {
                "Puskesmas Batang II",
                    "https://raw.githubusercontent.com/AdhimBagas/coronaLiveResource/master/puskesmasbatangII.jpg",
                    "Jl. RE Martadinata No.145, Klidangkongsi, Proyonanggan Utara, Kec. Batang, Kabupaten Batang, Jawa Tengah 51216",
                    "(0285) 391483",
                    "119",
                    "-",
                    "https://goo.gl/maps/RXHxmFbaErDK9oMk8"
            },
            {
                "Puskesmas Batang III",
                    "https://raw.githubusercontent.com/AdhimBagas/coronaLiveResource/master/puskesmas_batang3.jpg",
                    "Jl. Pemuda No.184, Cepokokuning, Kec. Batang, Kabupaten Batang, Jawa Tengah, Indonesia 51216",
                    "-",
                    "-",
                    "-",
                    "https://goo.gl/maps/t3N1YtPMCAbqqSrP8"
            },
            {
                "Puskesmas Warungasem",
                    "https://raw.githubusercontent.com/AdhimBagas/coronaLiveResource/master/puskemas%20warungasem.png",
                    "Jl. Raya Warungasem No. 06, Kec. Warungasem, Kabupaten Batang,Jawa Tengah, Indonesia 51252",
                    "(0285) 4417629",
                    "119",
                    "-",
                    "https://goo.gl/maps/pXdRVFDjX76ynqf96"
            }
    };

    public static ArrayList <Hospital> getListDataHost(){
        Hospital hospital;
        ArrayList<Hospital> listHost = new ArrayList<>();

        for (String [] mData : dataHospital){
            hospital = new Hospital();
            hospital.setNameHosp(mData[0]);
            hospital.setImageHosp(mData[1]);
            hospital.setAddresHosp(mData[2]);
            hospital.setTelphoneHosp(mData[3]);
            hospital.setAmbulanceHosp(mData[4]);
            hospital.setMessageHosp(mData[5]);
            hospital.setUrlHosp(mData[6]);

            listHost.add(hospital);
        }

        return listHost;
    }


}
