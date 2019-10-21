package com.example.listviewpresiden_.model

import com.example.listviewpresiden_.R

object BioPresiden {
    private val namapresiden = arrayOf(
        "Ir. Soekarno",
        "Soeharto",
        "BJ. Habibie",
        "Abdurrahman Wahid",
        "Megawati",
        "Susilo Bambang Yudhoyono",
        "Joko Widodo"
    )

    private val data = arrayOf(
        " Presiden pertama Republik Indonesia, Soekarno yang biasa dipanggil Bung Karno, lahir di Blitar, Jawa Timur, 6 Juni 1901 dan meninggal di Jakarta, 21 Juni 1970. Ayahnya bernama Raden Soekemi Sosrodihardjo dan ibunya Ida Ayu Nyoman Rai. Semasa hidupnya, beliau mempunyai tiga istri dan dikaruniai delapan anak. Dari istri Fatmawati mempunyai anak Guntur, Megawati, Rachmawati, Sukmawati dan Guruh. Dari istri Hartini mempunyai Taufan dan Bayu, sedangkan dari istri Ratna Sari Dewi, wanita turunan Jepang bernama asli Naoko Nemoto mempunyai anak Kartika.",
        "Soeharto adalah kedua Republik Indonesia. Beliau lahir di Kemusuk, Yogyakarta, tanggal 8 Juni 1921. Bapaknya bernama Kertosudiro seorang petani yang juga sebagai pembantu lurah dalam pengairan sawah desa, sedangkan ibunya bernama Sukirah.",
        "BJ. Habibie adalah Presiden ketiga Republik Indonesia, Bacharuddin Jusuf Habibie lahir di Pare-Pare, Sulawesi Selatan, pada 25 Juni 1936. Beliau merupakan anak keempat dari delapan bersaudara, pasangan Alwi Abdul Jalil Habibie dan RA. Tuti Marini Puspowardojo. Habibie yang menikah dengan Hasri Ainun Habibie pada tanggal 12 Mei 1962 ini dikaruniai dua orang putra yaitu Ilham Akbar dan Thareq Kemal.",
        "Gus Dur adalah putra pertama dari enam bersaudara yang dilahirkan di Denanyar Jombang Jawa Timur pada tanggal 4 Agustus 1940. Secara genetik Gus Dur adalah keturunan “darah biru”. Ayahnya, K.H. Wahid Hasyim adalah putra K.H. Hasyim Asy’ari, pendiri jam’iyah Nahdlatul Ulama (NU)-organisasi massa Islam terbesar di Indonesia-dan pendiri Pesantren Tebu Ireng Jombang. Ibundanya, Ny. Hj. Sholehah adalah putri pendiri Pesantren Denanyar Jombang, K.H. Bisri Syamsuri. Kakek dari pihak ibunya ini juga merupakan tokoh NU, yang menjadi Rais ‘Aam PBNU setelah K.H. Abdul Wahab Hasbullah. Dengan demikian, Gus Dur merupakan cucu dari dua ulama NU sekaligus, dan dua tokoh bangsa Indonesia.",
        "Presiden Republik Indonesia ke-5, Megawati Soekarnoputri lahir di Yogyakarta, 23 Januari 1947. Sebelum diangkat sebagai presiden, beliau adalah Wakil Presiden RI yang ke-8 dibawah pemerintahan Abdurrahman Wahid. Megawati adalah putri sulung dari Presiden RI pertama yang juga proklamator, Soekarno dan Fatmawati",
        "Susilo Bambang Yudhoyono adalah presiden RI ke-6. Berbeda dengan presiden sebelumnya, beliau merupakan presiden pertama yang dipilih secara langsung oleh rakyat dalam proses Pemilu Presiden putaran II 20 September 2004. Lulusan terbaik AKABRI (1973) yang akrab disapa SBY ini lahir di Pacitan, Jawa Timur 9 September 1949. Istrinya bernama Kristiani Herawati, merupakan putri ketiga almarhum Jenderal (Purn) Sarwo Edhi Wibowo.",
        " Joko Widodo atau Jokowi adalah Presiden ke-7 Indonesia yang mulai menjabat sejak 20 Oktober 2014. Ia terpilih bersama Wakil Presiden Muhammad Jusuf Kalla dalam Pemilu Presiden 2014 dan kembali terpilih bersama Wakil Presiden Ma'ruf Amin dalam Pemilu Serentak 2019"
    )

    private val presidenImage = intArrayOf(
        R.drawable.skrn,
        R.drawable.shrt,
        R.drawable.hb,
        R.drawable.gs,
        R.drawable.mg,
        R.drawable.sby,
        R.drawable.jk
    )

    val listPresiden: ArrayList<Presiden>
    get() {
        val list = arrayListOf<Presiden>()
        for (position in namapresiden.indices){
            val presiden = Presiden()
            presiden.name = namapresiden[position]
            presiden.data = data[position]
            presiden.poster = presidenImage[position]
            list.add(presiden)
        }
        return list
    }
}