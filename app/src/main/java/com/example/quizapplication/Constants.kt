package com.example.quizapplication

object Constants{
    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val q1 = Question(1, "What country does this flag belong to?", R.drawable.ic_flag_of_argentina,
                        "Argentina",
                        "Australia",
                        "Armenia",
                        "Austria",
                        1)

        val q2 = Question(2, "What country does this flag belong to?", R.drawable.ic_flag_of_australia,
            "United Kingdom",
            "Angola",
            "New Zealand",
            "Australia",
            4)

        val q3 = Question(3, "What country does this flag belong to?", R.drawable.ic_flag_of_belgium,
            "Belgium",
            "Netherlands",
            "Germany",
            "Denmark",
            1)

        val q4 = Question(4, "What country does this flag belong to?", R.drawable.ic_flag_of_brazil,
            "Uruguay",
            "Brazil",
            "Bolivia",
            "Peru",
            2)

        val q5 = Question(5, "What country does this flag belong to?", R.drawable.ic_flag_of_denmark,
            "Poland",
            "Norway",
            "Denmark",
            "France",
            3)

        val q6 = Question(6, "What country does this flag belong to?", R.drawable.ic_flag_of_fiji,
            "Indonesia",
            "Taiwan",
            "Philippines",
            "Fiji",
            4)

        val q7 = Question(7, "What country does this flag belong to?", R.drawable.ic_flag_of_germany,
            "Poland",
            "Austria",
            "Germany",
            "Portugal",
            3)

        val q8 = Question(8, "What country does this flag belong to?", R.drawable.ic_flag_of_india,
            "Pakistan",
            "India",
            "Sri Lanka",
            "Nepal",
            2)

        val q9 = Question(9, "What country does this flag belong to?", R.drawable.ic_flag_of_kuwait,
            "Syria",
            "Iraq",
            "Iran",
            "Kuwait",
            4)

        val q10 = Question(10, "What country does this flag belong to?", R.drawable.ic_flag_of_new_zealand,
            "New Zealand",
            "Australia",
            "Papua New Guinea",
            "Solomon Islands",
            1)

        questionsList.add(q1)
        questionsList.add(q2)
        questionsList.add(q3)
        questionsList.add(q4)
        questionsList.add(q5)
        questionsList.add(q6)
        questionsList.add(q7)
        questionsList.add(q8)
        questionsList.add(q9)
        questionsList.add(q10)

        return questionsList
    }
}