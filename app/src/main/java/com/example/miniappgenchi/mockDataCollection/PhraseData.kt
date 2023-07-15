package com.example.miniappgenchi.mockDataCollection

import com.example.miniappgenchi.dataClassCollection.Phrases

class PhraseData {
    fun getPhraseData():List<Phrases>{
         val phraseList = listOf(
             Phrases("Konnichiwa","Hello","こんにちは"),
             Phrases("ohayō gozaimasu","Good morning","おはようございます"),
             Phrases("Konbanwa","Good evening","こんばんは"),
             Phrases("Sayōnara","Goodbye (when going away for a long time or not coming back)","さようなら"),
             Phrases("Arigatō gozaimasu","Thank you very much","ありがとうございます"),
             Phrases("Sumimasen","Excuse me","すみません"),
             Phrases("Gomennasai","Sorry","ごめんなさい"),
             Phrases("Wakarimasen","I don’t understand","わかりません"),
             Phrases("Nihongo ga hanasemasen","I don’t speak Japanese","にほんごがはなせません"),
             Phrases("Onegaishimasu","Please (when asking for something)","おねがいします"),
             Phrases("Dōitashimashite","You’re welcome","どういたしまして"),
             Phrases("Hai / iie","Yes/No","はい / いいえ"),
             Phrases("Kekkō desu","No, thank you (more polite)","けっこうです"),
             Phrases("Eigo ga hanasemasu ka?","Do you speak English?","えいごがはなせます か"),
             Phrases("O genki desu ka?","How are you?","おげんきですか"),
             Phrases("Genki desu","I’m fine","げんきです"),
             Phrases("Hajimemashite","Nice to meet you","はじめまして"),
             Phrases("Kanpai!","Cheers!","かんぱい!"),
             Phrases("Yakushite kudasai?","Can you translate this?","やくしてください?"),
             Phrases("Toire wa doko desu ka?","Where is the toilet?","トイレはどこですか?"),
             Phrases("Kurejittokādo wa tsukaemaska？","Do you accept credit card?","クレジットカードはつかえますか?"),
             Phrases("Tasukete!","Help!","たすけて!"),
             Phrases("Oishi desu","This is delicious","おいしいです")
        )
        return phraseList
    }

}