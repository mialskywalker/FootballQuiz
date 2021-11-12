package com.mial.footballquiz

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions():ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "Which club has won the most Champions League titles?",
            R.drawable.ic_flag_of_argentina,
            "FC Barcelona", "Real Madrid", "Bayern Munich", "AC Milan",
            2
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "When was the first Premier League played?",
            R.drawable.ic_flag_of_argentina,
            "1985/86", "1943/44", "1996/97", "1992/93",
            4
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "Which Barcelona player was jailed after it was found that his passport was fake?",
            R.drawable.ic_flag_of_argentina,
            "Lionel Messi", "Samuel Eto'o", "Dani Alves", "Ronaldinho",
            4
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "Which footballer had a galaxy named after him?",
            R.drawable.ic_flag_of_argentina,
            "Cristiano Ronaldo", "Diego Maradona", "Lionel Messi", "Pele",
            1
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "Which player won the World Cup Young Player award in 2018?",
            R.drawable.ic_flag_of_argentina,
            "Vinicius Jr", "Kylian Mbappe", "Erling Haaland", "Frenkie de Jong",
            2
        )
        questionsList.add(que5)
        // TODO Questions

        return questionsList

    }

}