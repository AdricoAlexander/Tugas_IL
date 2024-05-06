package com.example.tugas_fe.Data

import androidx.compose.ui.res.painterResource
import com.example.tugas_fe.R

object inkasaaData {
    val inkasa =
        student(
            id = 1,
            name = "Adrico Alexander",
            pic = R.drawable.alex,
            desc = "Adrico Adalah seorang mahasiswa dengan kemampuan dibawah rata - rata namun dengan ketangguhan dan kegigihan nya dalam belajar Alex dapat melampaui berbagai permasalahan berat dalam kegiatan kampus nya",
            birth = "4 Juli 2003",
            age = 20,
            ipk = 3.20,
            insta = "https://www.instagram.com/lexxdrc/"
        )
    val inkasaList = listOf(
        inkasa,
        student(
            id = 2,
            name = "Muhammad Ilyas",
            pic = R.drawable.ilyas,
            desc = "Ilyas adalah seorang mahasiswa dengan jiwa kepemimpinan yang tinggi serta tergolong sebagai mahasiswa rajin dan taat aturan kebiasaanya sehari hari adalah merokok , ngoding , dan makan bakso",
            birth = "9 Januari 2003",
            age = 21,
            ipk = 3.53,
            insta = "https://www.instagram.com/iilyasss___/"
        ),
        student(
            id = 3,
            name = "Muhammad Azis Firdaus",
            pic = R.drawable.azis,
            desc = "Muhammad Azis Firdaus seorang mahasiswa aktif pada masa nya tidak kenal lelah dan pantang menyerah terhadap suatu permasalahan yang ia hadapi dalam sehari hari contoh nya saat meniru pekerjaan orang lain",
            birth = "11 Juli 2003",
            age = 21,
            ipk = 3.19,
            insta = "https://www.instagram.com/azizfirdausss/"
        ),
        student(
            id = 4,
            name = "Luthfy Fahlevi",
            pic = R.drawable.lutfi,
            desc = "Luthfy Fahlevi Amarullah adalah seorang mahasiswa Teknik Informatika dari Institu teknologi Nasional bandung setiap harinya ia selalu belajar dengan giat agar cita cita yang di impikan bisa tercapai",
            birth = "24 Mei 2002",
            age = 21,
            ipk = 3.78,
            insta = "https://www.instagram.com/luthfy_fhlv/"
        ),
        student(
            id = 5,
            name = "Junior Al Fani",
            pic = R.drawable.juno,
            desc = "Pemimpin dari segala pemimpin bos dari segala bos Juno adalah seorang dari inkasa yang memiliki kasta tersebut , Juno adalah seorang mahasiswa yang rajin dan selalu mencoba hal baru serta tekun terhadap bidangnya",
            birth = "11 juli 2002",
            age = 21,
            ipk = 3.11,
            insta = "https://www.instagram.com/juno.al_/"
        ),
        student(
            id = 6,
            name = "Raden Nuralif",
            pic = R.drawable.alif,
            desc = "Raden Nuralif adalah seorang fans MU yang gemar bermain bola dan menonton film kegiatan di kampusnya pun sama , ia anak yang rajin dan sering menanyakan pertanyaan berkualitas kepada dosen membuat dosen seringkali menunjuknya sebagai asisten lab",
            birth = "28 Maret 2002",
            age = 22,
            ipk = 3.45,
            insta = "https://www.instagram.com/juno.al_/"
        ),
        student(
            id = 7,
            name = "Muhammad Taopik",
            pic = R.drawable.opik,
            desc = "Opik seorang yang baik hati dan sering membantu tanpa berharap balasan , dikampus opik sering membantu orang orang yang kesusahan dalam hal programming maupun lainnya serta membuatnya banyak di temani orang orang hebat",
            birth = "10 Juni 2002",
            age = 21,
            ipk = 3.39,
            insta = "https://www.instagram.com/muhamadtaopik_/"
        ),
        student(
            id = 8,
            name = "Farhan Al Farisi",
            pic = R.drawable.farhan,
            desc = "Farhan adalah seorang mahasiswa Institut teknologi Nasional Bandung yang memiliki kemampuan diatas rata - rata / bisa dibilang genius tetapi kegeniusannya tidak membuatnya menjadi sombong tetapi ia pakai untuk membantu teman temannya yang kesusahan memahami materi",
            birth = "12 November 2002",
            age = 21,
            ipk = 3.80,
            insta = "https://www.instagram.com/farhan.alfrz/"
        ),
        student(
            id = 9,
            name = "Ramzi Syuhada",
            pic = R.drawable.aji,
            desc = "Ramzi Syuhada adalah orang yang menjadi singa jika dalam hal implementasi namun domba dalam teori , karena itu banyak orang orang yang meminta bantuan tugas agar bisa terselesaikan dengan bantuan Ramzi, tetapi ramzi tidak merasa keberatan dan selalu membantu selagi dia bisa",
            birth = "24 Juni 2003",
            age = 20,
            ipk = 3.56,
            insta = "https://www.instagram.com/ramzisyu/"
        ),
        student(
            id = 10,
            name = "Muhammad Iksan",
            pic = R.drawable.cufmh,
            desc = "Iksan adalah mahasiswa misterius dikampus, semua orang selalu merasa kedinginan di dekatnya mungkin dikarenakan hawa nya yang memang mengerikan , tetapi ia adalah anak yang ramah dan selalu ikut bersosialisi dengan inkasaa",
            birth = "28 Maret 2004",
            age = 19,
            ipk = 3.42,
            insta = "https://www.instagram.com/iikhsaan.r/"
        ),
        student(
            id = 11,
            name = "Firhan Hafiansyah",
            pic = R.drawable.firhan,
            desc = "Firhan adalah seorang mahasiswa yang gemar berbicara secara keras dan lantang dikarenakan dulunya ia seorang aktivis di tim pramuka hebat, tak cuma itu ia juga merupakan supporter dari tim basket kebanggaanya yaitu prawira",
            birth = "29 Februari 2003",
            age = 19,
            ipk = 4.00,
            insta = "https://www.instagram.com/firhanhafiansyah/"
        ),
    )
}

object foodData {
    val food =
        bandungFood(
            id = 1,
            name = "Batagor",
            pic = R.drawable.batagor,
            desc = "Batagor merupakan singkatan dari \"Bakso Tahu Goreng\", dan ini adalah salah satu makanan favorit yang wajib dicoba ketika mengunjungi kota ini.\n" +
                    "\n" +
                    "Saat kamu pertama kali melahap sepotong Batagor, kamu akan merasakan kombinasi yang menarik antara daging ikan yang lembut dan tahu yang gurih, semuanya dibalut dalam lapisan kulit pangsit yang renyah. Sensasi renyah dari lapisan luar yang digoreng membuatnya begitu memikat.",
            rate = 4.8
        )
    val foodlist = listOf(
        food,
        bandungFood(
            id = 2,
            name = "Mie Kocok",
            pic = R.drawable.miekocokbandung,
            desc = "Mi Kocok Bandung terdiri dari mi yang biasanya berupa mi kuning yang lembut, disajikan dalam kuah yang kental dan gurih. Kuah ini biasanya terbuat dari kaldu sapi yang kaya rasa, dengan tambahan bumbu-bumbu seperti bawang putih, bawang merah, ketumbar, dan merica yang memberikan aroma dan rasa yang khas.",
            rate = 3.9
        ),
        bandungFood(
            id = 3,
            name = "Lotek",
            pic = R.drawable.lotek,
            desc = "Sayuran yang biasanya digunakan dalam lotek antara lain kubis, tauge (kecambah), kacang panjang, kentang rebus, dan bayam. Semua sayuran ini kemudian disiram dengan bumbu kacang yang terbuat dari campuran kacang tanah, cabai rawit, bawang putih, gula merah, garam, dan air jeruk nipis. Bumbu kacang ini memberikan cita rasa gurih, pedas, manis, dan asam yang seimbang, menciptakan harmoni rasa yang lezat.",
            rate = 4.2
        ),
        bandungFood(
            id = 4,
            name = "Bandros",
            pic = R.drawable.bandros,
            desc = "Kesan pertama saat mencicipi Bandros mungkin adalah kelezatan rasa manis yang lembut dan teksturnya yang kenyal. Rasanya yang tidak terlalu manis membuatnya cocok sebagai camilan ringan atau sebagai teman secangkir teh atau kopi. Bandros juga bisa ditemui dalam variasi modern dengan tambahan topping seperti keju atau cokelat, memberikan sentuhan baru yang menarik pada hidangan klasik ini.",
            rate = 4.5
        ),
        bandungFood(
            id = 5,
            name = "Cuanki",
            pic = R.drawable.cuanki,
            desc = "\n" +
                    "Cuanki adalah salah satu makanan jajanan khas Bandung yang menjadi favorit banyak orang. Ini adalah semacam bakso yang terbuat dari campuran tepung tapioka dan tepung terigu yang dibentuk menjadi bulatan kecil, kemudian direbus dalam kuah kaldu yang gurih.",
            rate = 4.8
        ),
        bandungFood(
            id = 6,
            name = "Seblak",
            pic = R.drawable.seblak,
            desc = "Yang membuat seblak begitu istimewa adalah bumbu khasnya. Bumbu-bumbu ini terdiri dari cabai, bawang putih, bawang merah, garam, dan penyedap rasa lainnya, yang kemudian diolah menjadi saus dengan tekstur yang kental dan beraroma kuat. Beberapa tempat juga menambahkan bumbu tambahan seperti saus tomat, saus sambal, atau kecap manis untuk memberikan variasi rasa yang lebih kompleks.",
            rate = 4.5
        ),
        bandungFood(
            id = 7,
            name = "Combro",
            pic = R.drawable.combro,
            desc = "Aroma khas combro yang gurih dan renyah begitu menggugah selera begitu kamu mencicipinya. Bagian luar combro yang digoreng hingga crispy memberikan sensasi renyah yang memikat, sementara bagian dalamnya yang lembut dan gurih, berkat singkong parut dan isian yang di dalamnya, memberikan dimensi rasa yang beragam.",
            rate = 4.3
        ),
        bandungFood(
            id = 8,
            name = "Cimol",
            pic = R.drawable.cimol,
            desc = "Cimol terbuat dari campuran tepung kanji, tepung terigu, bawang putih, bawang merah, garam, dan penyedap rasa lainnya yang dicampur hingga menjadi adonan. Adonan ini kemudian dibentuk menjadi bulatan kecil dan direbus dalam air mendidih hingga mengapung, lalu ditiriskan. Setelah itu, cimol digoreng hingga kecokelatan dan siap disajikan.",
            rate = 3.8
        ),
        bandungFood(
            id = 9,
            name = "Cilok",
            pic = R.drawable.cilok,
            desc = "Cilok terbuat dari campuran tepung kanji, bawang putih, garam, penyedap rasa, dan air, yang kemudian diuleni hingga menjadi adonan yang kalis. Adonan ini kemudian dibentuk menjadi bulatan kecil dan dimasak dalam air mendidih hingga mengapung. Setelah itu, cilok disajikan dengan atau tanpa bumbu tambahan.",
            rate = 4.1
        ),
        bandungFood(
            id = 10,
            name = "Roti Gempol",
            pic = R.drawable.rotigempol,
            desc = "Kesan pertama saat mencicipi Roti Gempol mungkin adalah sensasi lembutnya roti yang diimbangi dengan rasa manis yang pas. Ketika kamu menggigitnya, kamu akan merasakan sensasi lembut roti yang bertekstur, dan aroma harum mentega yang tercium. Rasanya yang manis tidak terlalu kuat, sehingga cocok untuk dinikmati sebagai camilan ringan atau sebagai teman minum teh atau kopi.",
            rate = 5.0
        )
    )
}

object aboutData {
    val biodata =
        about(
            nim = 152021026,
            name = "Adrico Alexander P",
            pic = R.drawable.adrico,
            birth = "4 Juli 2003",
            email = "adrico.alexander@mhs.itenas.ac.id",
            univ = "Institut Teknologi Itenas Bandung",
            jurusan = "Informatika",
            hobi = "Bermain game dan Rebahan"
        )
}

object tripData {
    val trippin =
        inkasaTrip(
            id = 0,
            name = "Puncak Bogor",
            pic = R.drawable.bogor,
            date = "24 Januari 2024",
            desc = "Liburan bersama ke arah puncak bogor diam di suatu villa bersama teman teman banyak sekali keseruannya seperti berenang bersama , bernyanyi bersama, dan ditutup dengan bakar - bakar ayam di malam hari lalu besoknya pulang"
        )
    val tripList =
        listOf(
            trippin,
            inkasaTrip(
                id = 1,
                name = "Ciwidey",
                pic = R.drawable.ciwidey,
                date = "14 Mei 2023",
                desc = "Melakukan convoy bersama teman teman di hari minggu atau bisa dibilang sunmori dengan tujuan ke arah ciwidey , lalu sambung ke cidaun , banyak kesenangan yang terjadi disana seperti melihat sejuk nya laut serta jalan jalan bersama",
            ),
            inkasaTrip(
                id = 2,
                name = "Karang PakPak",
                pic = R.drawable.karangpakpak,
                date = "22 September 2023",
                desc = "Jalan Jalan ke arah garut ujung yang berupa pemandangan pantai karang pak pak , kegiatan yang kami lakukan ada banyak seperti karaoke, lalu tak lupa mengabari orang tua agar selamat dijalan"
            ),
            inkasaTrip(
                id = 3,
                name = "Kecelakaan",
                pic = R.drawable.kecelakaan,
                date = "23 September 2023",
                desc = "Musibah terjadi saat jalan pulang ke arah Bandung, tiba - tiba ban bocor saat sedang berbelok membuat motor saya tergelincir sedikit lalu jatuh dengan paha duluan yang mendarat"
            ),
            inkasaTrip(
                id = 4,
                name = "Foto Bersama Pak Dosen",
                pic = R.drawable.fotobersama,
                date = "2 Oktober 2023",
                desc = "Setelah selesai menjalani proses ujian tengah semester (UTS) kami diberi ucapan selamat dari dosen kami tercinta , beberapa dari kami terharu dan meminta foto bersama"
            ),
            inkasaTrip(
                id = 5,
                name = "Kelas Jaringan",
                pic = R.drawable.ramzi,
                date = "17 Oktober 2023",
                desc = "Disaat kepala sudah melakukan brainstorming secara intens kami pun sudah mulai kewalahan kelas jaringan lalu saya mengabadikan momen dengan teman saya ramzi untuk mengenang betapa lelah nya belajar jaringan komputer"
            ),
            inkasaTrip(
                id = 6,
                name = "Agri Lembang",
                pic = R.drawable.agrilembang,
                date = "29 Oktober 2023",
                desc = "Hari dimana kami melakukan research ke tempat untuk memenuhi projek akhir kelas Internet Of Things yaitu membangun suatu smart greenhouse , dan di momen ini kami sedang melakukan research apa saja sih yang dibutuhkan oleh greenhouse ?"
            ),
            inkasaTrip(
                id = 7,
                name = "Sepulang Agri Lembang",
                pic = R.drawable.agrilembangbalik,
                date = "29 Oktober 2023",
                desc = "Sepulang kami dari greenhouse yang ada dilembang kami sempat merasa lelah karena telah melakukan research lapang dibawah panasnya sinar matahari , lalu kamipun singgah di masjid dekat dan mengabadikan momen disana"
            ),
            inkasaTrip(
                id = 8,
                name = "Menjadi Pengawas Ujian",
                pic = R.drawable.kelas,
                date = "2 November 2023",
                desc = "Saat saya telah selesai belajar dikelas lalu mendapat penawaran menjadi pengawas ujian adik tingkat lalu karena tidak punya kegiatan apa - apa sehingga saya menjadi sukarelawan untuk itu"
            ),
            inkasaTrip(
                id = 9,
                name = "Pembelajaran AI",
                pic = R.drawable.ai,
                date = "13 Desember 2023",
                desc = "Disaat gempuran pusing nya pelajaran Artificial Intellegence dikarenakan materinya yang sudah seperti memahami isi kepala dari albert enstein membuat saya mual dan akhir nya memfoto materi tersebut dan mempelajarinya di lain hari"
            ),
            inkasaTrip(
                id = 10,
                name = "Menjadi Badut",
                pic = R.drawable.badut,
                date = "4 Oktober 2022",
                desc = "Universitas mengadakan pameran dari jurusan DKV lalu saya dan teman teman saya ikut berpartisipasi sebagai pengunjung pameran dimana banyak sekali karya - karya menarik dan membuat saya takjub lalu taklupa kami berfoto disana"
            )
        )
}