package com.dicoding.angga;

import java.util.ArrayList;

class AnimalData {
    private static String[] animalNames = {
            "kucing",
            "anjing",
            "buaya",
            "beruang",
            "harimau",
            "singa",
            "kelelawar",
            "pinguin",
            "kuda",
            "babi"
    };

    private static String[] animalDetails = {
            "Kucing adalah jenis hewan mamalia karnivora yang berasal dari keluarga Felidae. Habitat kucing adalah di darat yang biasanya berbaur dengan manusia sebagai peliharaan dan ada juga yang hidup liar..",
            "anjing adalah hewan mamalia yang telah mengalami domestikasi dari serigala sejak 15.000 tahun yang lalu, bahkan kemungkinan sudah sejak 100.000 tahun yang lalu berdasarkan bukti genetik berupa penemuan fosil dan tes DNA. Penelitian lain mengungkap sejarah domestikasi anjing yang belum begitu lama.",
            "Buaya adalah reptil bertubuh besar yang hidup di air. Secara ilmiah, buaya meliputi seluruh spesies anggota suku Crocodylidae, termasuk pula buaya sepit. Meski demikian nama ini dapat pula dikenakan secara longgar untuk menyebut buaya aligator.",
            "Beruang adalah binatang kuat yang berhibernasi selama musim dingin, namun setelahnya akan bangkit dengan kekuatannya yang sangat luar biasa.",
            "Harimau adalah spesies kucing terbesar yang masih hidup dari genus Panthera. Harimau memiliki ciri loreng yang khas pada bulunya, berupa garis-garis vertikal gelap pada bulu oranye, dengan bulu bagian bawah berwarna putih.",
            "Singa adalah spesies hewan dari keluarga felidae atau jenis kucing. Singa berada di benua Afrika dan sebagian di wilayah India. Singa merupakan hewan yang hidup berkelompok. Biasanya terdiri dari seekor jantan & banyak betina. Kelompok ini menjaga daerah kekuasaannya.",
            "Kelelawar adalah satu-satunya mamalia yang dapat terbang, dan berasal dari ordo Chiroptera dengan kedua kaki depan yang berkembang menjadi sayap..",
            "Penguin atau pinguin adalah hewan akuatik jenis burung yang tidak bisa terbang dan secara umum hidup di belahan Bumi selatan. Di seluruh dunia terdapat 16 spesies penguin tergantung pada apakah dua spesies Eudyptula dihitung juga sebagai spesies.",
            "Kuda adalah salah satu dari sepuluh spesies modern mamalia dari genus Equus. Hewan ini telah lama merupakan salah satu hewan peliharaan yang penting secara ekonomis dan historis, dan telah memegang peranan penting dalam pengangkutan orang dan barang selama ribuan tahun.",
            "Babi adalah sejenis hewan ungulata yang bermoncong panjang dan berhidung lemper dan merupakan hewan yang aslinya berasal dari Eurasia. Babi merupakan omnivora yang berarti mereka mengonsumsi daging maupun tumbuh-tumbuhan."
    };

    private static int[] animalImages = {
            R.drawable.kucing,
            R.drawable.anjing,
            R.drawable.buaya,
            R.drawable.beruang,
            R.drawable.harimau,
            R.drawable.singa,
            R.drawable.kelelawar,
            R.drawable.pinguin,
            R.drawable.kuda,
            R.drawable.babi
    };

    static ArrayList<animal> getListData() {
        ArrayList<animal> list = new ArrayList<>();
        for (int position = 0; position < animalNames.length; position++) {
            animal animal = new animal();
            animal.setName(animalNames[position]);
            animal.setDetail(animalDetails[position]);
            animal.setPhoto(animalImages[position]);
            list.add(animal);
        }
        return list;
    }
}