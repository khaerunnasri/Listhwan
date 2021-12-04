package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Ayam;
import simple.example.hewanpedia.model.Burung;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Ikan;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Ayam> initDataAyam(Context ctx) {
        List<Ayam> ayams = new ArrayList<>();
        ayams.add(new Ayam("Ayam Kapas", "Tiongkok",
                "Ayam sutra atau ayam kapas adalah ras ayam yang dinamakan sesuai bulunya yang halus dan terasa seperti sutra", R.drawable.ayam_kapas));
        ayams.add(new Ayam("Ayam Orpington", "Tenggara Inggris",
                "Orpington adalah jenis ayam Inggris. Itu dibesarkan pada akhir abad kesembilan belas oleh William Cook dari Orpington, Kent di tenggara Inggris", R.drawable.ayam_orpington));
        ayams.add(new Ayam("Ayam Kedu", "Indonesia",
                "Ayam kedu, ayam selasih, atau ayam cemani adalah ras ayam lokal yang telah dikembangkan di di Pulau Jawa sejak abad ke-12. Ayam cemani memiliki gen dominan yang menyebabkan", R.drawable.ayam_kedu));
        ayams.add(new Ayam("Ayam Wyandotte", "Amerika Utara",
                "Wyandotte adalah jenis tujuan ganda, dipelihara untuk telur coklatnya dan dagingnya yang berkulit kuning.", R.drawable.ayam_wyandotte));
        ayams.add(new Ayam("Shamo", "Thailand",
                "Trah Shamo diperkirakan berasal dari pertempuran ayam jenis Melayu yang dibawa dari Thailand pada awal abad ketujuh belas", R.drawable.ayam_shamo));
        ayams.add(new Ayam("Serama", "Malaysia",
                "Diterjemahkan dari bahasa Inggris-Serama, juga disebut Serama Malaysia, adalah jenis bantam ayam yang berasal dari Malaysia dalam 50 tahun terakhir", R.drawable.ayam_serama));
        return ayams;
    }

    private static List<Burung> initDataBurung(Context ctx) {
        List<Burung> burungs = new ArrayList<>();
        burungs.add(new Burung("Torako", "Afrika Selatan",
                "Turacos membentuk keluarga burung Musophagidae, yang termasuk pemakan pisang raja dan burung yang pergi. Di Afrika bagian selatan", R.drawable.burung_turako));
        burungs.add(new Burung("Sphenisciformes", "Antartika",
                "Penguin atau pinguin (ordo Sphenisciformes, famili Spheniscidae) adalah hewan akuatik jenis burung yang tidak bisa terbang dan secara umum hidup di belahan Bumi selatan", R.drawable.burung_sphenisciformes));
        burungs.add(new Burung("Cerek", "Indonesia",
                "Cerek jawa adalah sejenis burung perandai atau burung pantai yang berukuran relatif kecil. Semula diduga merupakan burung endemik Pulau Jawa, kini diketahui bahwa cerek jawa menyebar luas di banyak wilayah pesisir di Indonesia ", R.drawable.burung_cerek_dan_trulek));
        burungs.add(new Burung("Sulidae", "Australia",
                "Keluarga burung Sulidae terdiri dari gannet dan boobies. Secara kolektif disebut sulfida, mereka adalah burung laut pesisir menengah-besar yang terjun untuk mencari ikan dan mangsa serupa", R.drawable.burung_sulidae));
        burungs.add(new Burung("Otididae", "Bustard Afrika",
                "adalah burung darat besar yang hidup terutama di daerah padang rumput kering dan di stepa Dunia Lama", R.drawable.burung_otidedae));
        burungs.add(new Burung("Dara Laut", "Perairan Antartika",
                "Dara-laut adalah burung laut di dalam keluarga Sternidae, masih berkerabat dengan Burung Camar. Burung Dara-laut dapat ditemukan di seluruh dunia", R.drawable.burung_dara_laut));
        return burungs;
    }

    private static List<Ikan> initDataIkan(Context ctx) {
        List<Ikan> ikans = new ArrayList<>();
        ikans.add(new Ikan("Ikan Mandarin", "Samudra Pasifik",
                "Ikan mandarin adalah ikan kecil berwarna cerah yang termasuk dalam familia dragonet, yang terkenal dalam bisnis akuarium air laut. Ikan mandarin berasal dari Samudera Pasifik, berkisar dari Kepulauan Ryukyu hingga Australia", R.drawable.ikan_mandarin));
        ikans.add(new Ikan("Ikan Matahari", "Perairan Tropis",
                "Diterjemahkan dari bahasa Inggris-Mola-mola laut atau mola umum adalah salah satu dari dua ikan bertulang terberat yang diketahui di dunia, yang lainnya adalah mola-mola selatan dari genus yang sama.", R.drawable.ikan_matahari));
        ikans.add(new Ikan("Raja Herring", " Zona Pelagis",
                "Ikan Raja Herring merupakan spesies dari oarfish dari keluarga Regalecidae", R.drawable.raja_herring));
        ikans.add(new Ikan("Ikan Zebra", "Asia Selatan",
                "Ikan zebra adalah salah satu spesies ikan bermarga Danio dari keluarga siprinide", R.drawable.ikan_zebra));
        ikans.add(new Ikan("Leter Enam", " Indo-Pasifik dan sering kali terlihat di terumbu karang Afrika Timur, Jepang, Kaledonia Baru, Samoa dan Karang Penghalang Besar",
                "Paracanthurus hepatus adalah salah satu spesies ikan yang hidup di terumbu karang", R.drawable.leter_enam));
        ikans.add(new Ikan("Molly", "Meksiko",
                "Ikan molly (Poecilia sphenops) adalah salah satu jenis ikan peliharaan yang cukup populer di kalangan aquarists", R.drawable.molly));
        return ikans;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataAyam(ctx));
        hewans.addAll(initDataBurung(ctx));
        hewans.addAll(initDataIkan(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
