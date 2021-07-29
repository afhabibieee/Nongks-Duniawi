package com.example.nongksduniawi

object CafeData {
    private val cafeName = arrayOf(
        "MayHaps Coffee & Gelato",
        "Titik Temu Coffee",
        "Koultoura Coffee",
        "Acaraki",
        "Cork & Screw Country Club",
        "Filosofi Kopi Melawai",
        "CLIQ Coffee & Kitchen",
        "Maple & Oak",
        "Kokonut & Curtains",
        "1/15 Coffee Menteng",
        "LIMA"
    )

    private val cafeServiceOption = arrayOf(
        "Dine-in, Takeaway, No-contact delivery",
        "Dine-in, Takeaway, Delivery",
        "Dine-in, Takeaway",
        "Dine-in, Takeaway, No-contact delivery",
        "Dine-in, Takeaway, No-contact delivery",
        "Dine-in, Takeaway, No-contact delivery",
        "Dine-in, Takeaway, Delivery",
        "Dine-in, Takeaway, Delivery",
        "Dine-in, Takeaway",
        "Dine-in, Takeaway, No-contact delivery",
        "Dine-in, Takeaway, Delivery",
    )

    private val cafeCity = arrayOf(
        "Jakarta Selatan",
        "Jakarta Selatan",
        "Jakarta Barat",
        "Jakarta Selatan",
        "Jakarta Selatan",
        "Jakarta Selatan",
        "Jakarta Selatan",
        "Jakarta Pusat",
        "Jakarta Pusat",
        "Jakarta Pusat",
        "Jakarta Utara"
    )

    private  val cafeAddress = arrayOf(
        "Jl. Panglima Polim V 38-4, RT.1/RW.7, Melawai, Kec. Kby. Baru, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12160",
        "Panglima Polim St No.37, RT.1/RW.1, Melawai, Kebayoran Baru, South Jakarta City, Jakarta 12160",
        "Jl. Pantai Indah Selatan No.11, RT.3/RW.3, Kamal Muara, Kec. Penjaringan, Kota Jkt Utara, Daerah Khusus Ibukota Jakarta 14470",
        "Jl. Kemang Raya No.122, RT.3/RW.2, Bangka, Kec. Mampang Prpt., Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12730",
        "National Golf Club, Jl. Asia Afrika Pintu IX The MAJ, RT.1/RW.3, Senayan, Jakarta, Daerah Khusus Ibukota Jakarta 10270",
        "Kawasan Terpadu Blok M Square, Jl. Melawai 6 No.1, RT.3/RW.1, Melawai, Kec. Kby. Baru, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12160",
        "Jl. Cipaku I No.9A, RT.2/RW.4, Petogogan, Kec. Kby. Baru, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12170",
        "Jl. HOS. Cokroaminoto No.91, RT.3/RW.5, Menteng, Kec. Menteng, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta 10310",
        "Komplek Taman Ria Senayan, Jl. Gatot Subroto, RT.1/RW.3, Gelora, Kecamatan Tanah Abang, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta 10270",
        "Jl. Dr. Kusuma Atmaja No.79, RT.10/RW.4, Menteng, Kec. Menteng, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta 10310",
        "Rukan Gold Coast, Jl. Pantai Indah Kapuk No.5, RT.6/RW.2, Kamal Muara, Kec. Penjaringan, Kota Jkt Utara, Daerah Khusus Ibukota Jakarta 14460"
    )

    private val cafePhone = arrayOf(
        "08176763747",
        "082114120079",
        "02122572007",
        "02122715889",
        "0215706365",
        "02173910939",
        "082124302883",
        "0213906757",
        "082122112329",
        "081290002128",
        "02129032885"
    )

    private val cafePhoto = intArrayOf(
        R.drawable.mayhaps,
        R.drawable.titik_temu,
        R.drawable.koultoura,
        R.drawable.acaraki,
        R.drawable.cork_screw,
        R.drawable.filosopi_kopi,
        R.drawable.cliq,
        R.drawable.maple_oak,
        R.drawable.kokonut_curtains,
        R.drawable.satu_limabelas,
        R.drawable.lima
    )

    private val cafeLatituteLongitude = arrayOf(
        "-6.250406093020991, 106.79819449795491",
        "-6.241383651584237, 106.79872066023012",
        "-6.122931653928403, 106.7410399492548",
        "-6.2721125090808, 106.81497954223805",
        "-6.225927607356173, 106.79793725813626",
        "-6.244521265672503, 106.7995669262241",
        "-6.239438795735607, 106.81140939677523",
        "-6.198032181926023, 106.82868920552647",
        "-6.210460462262245, 106.80487002622375",
        "-6.19776016939584, 106.82419691910121",
        "-6.104682561824455, 106.74010899677494"
    )

    val listData: ArrayList<Cafe>
        get() {
            val list = arrayListOf<Cafe>()
            for (position in cafeName.indices) {
                val cafe = Cafe()
                cafe.name = cafeName[position]
                cafe.serviceOption = cafeServiceOption[position]
                cafe.city = cafeCity[position]
                cafe.address = cafeAddress[position]
                cafe.phone = cafePhone[position]
                cafe.photo = cafePhoto[position]
                cafe.latLong = cafeLatituteLongitude[position]
                list.add(cafe)
            }
            return list
        }
}