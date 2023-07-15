package com.example.miniappgenchi.mockDataCollection

import com.example.miniappgenchi.dataClassCollection.Vocabulary

//my reference for this hehe :) -https://speechling.com/blog/top-100-basic-japanese-words-for-beginners/
class VocabData {
    fun getVocabData():List<Vocabulary>{
        val vocabList = listOf(
            Vocabulary("hon","Book","本"),
            Vocabulary("beddo","Bed","ベッド"),
            Vocabulary("tanjōbi","Birthday","誕生日"),
            Vocabulary("tokei","Watch or Clock","時計"),
            Vocabulary("namae","Name","名前"),
            Vocabulary("kirei","Beautiful","きれい"),
            Vocabulary("kuroi","Black","黒い"),
            Vocabulary("shiroi","White","白い"),
            Vocabulary("eigo","English (language)","英語 "),
            Vocabulary("daigaku","University","大学"),
            Vocabulary("denwa","Telephone","電話"),
            Vocabulary("basu","Bus","バス"),


            Vocabulary("neko","Cat","猫"),
            Vocabulary("inu","Dog","犬"),
            Vocabulary("konpiūta","Computer","コンピュータ"),
            Vocabulary("fuku","Clothes","服"),
            Vocabulary("kohi","Coffee","コーヒー ()"),
            Vocabulary("biru","Beer","ビール"),
            Vocabulary("hirogohan","Lunch","昼ご飯"),
            Vocabulary("yūshoku","Dinner","夕食"),
            Vocabulary("tabemono","Food","食べ物"),
            Vocabulary("otoko no ko","Boy","男の子"),
            Vocabulary("onna no ko","Girl","女の子"),
            Vocabulary("kodomo","Child","子供"),
            Vocabulary("chichi","Father","父"),
            Vocabulary("tomodachi","Friend","友達"),
            Vocabulary("kagusei","Student","学生"),
            Vocabulary("sensei","Teacher","先生"),
            )

        return vocabList
    }
}