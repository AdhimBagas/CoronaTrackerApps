package com.dicoding.coronalive.Model;

import java.util.ArrayList;

public class PreventionData {

    public static String[][] data = new String[][]{

            {
                "Cuci Tangan",
                    "https://raw.githubusercontent.com/AdhimBagas/coronaLiveResource/master/handwash.png",
                    "Cuci tangan dengan durasi minimal 20 detik menggunakan sabun dan air bersih yang mengalir"
            },
            {
                    "Gunakan Handsanitizer",
                    "https://raw.githubusercontent.com/AdhimBagas/coronaLiveResource/master/shoap.png",
                    "Bawalah handsanitizer saat berpergian, gunakan saat dibutuhkan"
            },
            {
                "Hindari Sentuh Wajah",
                    "https://raw.githubusercontent.com/AdhimBagas/coronaLiveResource/master/contact.png",
                    "Virus corona disinyalir dapat masuk tubuh melalui segitiga wajah yakni mata, hidung, dan mulut"
            },
            {
                    "Memakai Masker",
                    "https://raw.githubusercontent.com/AdhimBagas/coronaLiveResource/master/mask.png",
                    "untuk melindungi diri dari bahaya luar dan menghindari ketika bersin agar tidak kemana mana."
            },
            {
                    "Hindari Interaksi Langsung",
                    "https://raw.githubusercontent.com/AdhimBagas/coronaLiveResource/master/handshake.png",
                    "Hindari interaksi secara langsung seperti berpelukan, berjabat tangan, dan lain sebagainya"
            },
            {
                    "Social Distancing",
                    "https://raw.githubusercontent.com/AdhimBagas/coronaLiveResource/master/socialDistance.png",
                    "menjaga jarak antara satu sama lain dipercaya dapat mengurangi risiko penyebaran virus corona"
            },
            {
                    "Cuci Bahan Makanan",
                    "https://raw.githubusercontent.com/AdhimBagas/coronaLiveResource/master/bahan_makanan.png",
                    "Cuci selalu bahan makanan yang diperoleh sebelum mengolahnya"
            },
            {
                    "Cuci Perabotan Rumah",
                    "https://raw.githubusercontent.com/AdhimBagas/coronaLiveResource/master/perabotan_rumah.png",
                    "Virus corona dapat menempel pada permukaan benda yang sering terjadi interaksi"
            },
            {
                    "Tingkatkan Imun Tubuh",
                    "https://raw.githubusercontent.com/AdhimBagas/coronaLiveResource/master/imun_1.png",
                    "melakukan aktivitas fisik secara rutin dan mengonsumsi makanan sehat yang dapat meningkatkan sistem kekebalan tubuh."
            }

    };

    public static ArrayList<Prevention> getLisData(){
        Prevention prevention;
        ArrayList<Prevention> list = new ArrayList<>();

        for (String[] mData:data){
            prevention = new Prevention();
            prevention.setName(mData[0]);
            prevention.setPhoto(mData[1]);
            prevention.setDescription(mData[2]);

            list.add(prevention);
        }
        return list;
    }
}
