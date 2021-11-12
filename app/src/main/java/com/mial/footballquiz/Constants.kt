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

        val que6 = Question(
            6, "Which manager was famously said to have given players 'the Hairdryer Treatment'?",
            R.drawable.ic_flag_of_argentina,
            "Sir Alex Ferguson", "Pep Guardiola", "aland", "Frenkie de Jong",
            1
        )
        questionsList.add(que6)

        val que7 = Question(
            7, "Which manager was famously said to have given players 'the Hairdryer Treatment'?",
            R.drawable.ic_flag_of_argentina,
            "Sir Alex Ferguson", "Pep Guardiola", "aland", "Frenkie de Jong",
            1
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "Which manager was famously said to have given players 'the Hairdryer Treatment'?",
            R.drawable.ic_flag_of_argentina,
            "Sir Alex Ferguson", "Pep Guardiola", "aland", "Frenkie de Jong",
            1
        )
        questionsList.add(que8)

        val que9 = Question(
            9, "Which manager was famously said to have given players 'the Hairdryer Treatment'?",
            R.drawable.ic_flag_of_argentina,
            "Sir Alex Ferguson", "Pep Guardiola", "aland", "Frenkie de Jong",
            1
        )
        questionsList.add(que9)

        val que10 = Question(
            10, "Which manager was famously said to have given players 'the Hairdryer Treatment'?",
            R.drawable.ic_flag_of_argentina,
            "Sir Alex Ferguson", "Pep Guardiola", "aland", "Frenkie de Jong",
            1
        )
        questionsList.add(que10)

        val que11 = Question(
            11, "Which manager was famously said to have given players 'the Hairdryer Treatment'?",
            R.drawable.ic_flag_of_argentina,
            "Sir Alex Ferguson", "Pep Guardiola", "aland", "Frenkie de Jong",
            1
        )
        questionsList.add(que11)

        val que12 = Question(
            12, "Which manager was famously said to have given players 'the Hairdryer Treatment'?",
            R.drawable.ic_flag_of_argentina,
            "Sir Alex Ferguson", "Pep Guardiola", "aland", "Frenkie de Jong",
            1
        )
        questionsList.add(que12)

        val que13 = Question(
            13, "Which manager was famously said to have given players 'the Hairdryer Treatment'?",
            R.drawable.ic_flag_of_argentina,
            "Sir Alex Ferguson", "Pep Guardiola", "aland", "Frenkie de Jong",
            1
        )
        questionsList.add(que13)

        val que14 = Question(
            14, "Which manager was famously said to have given players 'the Hairdryer Treatment'?",
            R.drawable.ic_flag_of_argentina,
            "Sir Alex Ferguson", "Pep Guardiola", "aland", "Frenkie de Jong",
            1
        )
        questionsList.add(que14)

        val que15 = Question(
            15, "Which manager was famously said to have given players 'the Hairdryer Treatment'?",
            R.drawable.ic_flag_of_argentina,
            "Sir Alex Ferguson", "Pep Guardiola", "aland", "Frenkie de Jong",
            1
        )
        questionsList.add(que15)

        val que16 = Question(
            16, "Which manager was famously said to have given players 'the Hairdryer Treatment'?",
            R.drawable.ic_flag_of_argentina,
            "Sir Alex Ferguson", "Pep Guardiola", "aland", "Frenkie de Jong",
            1
        )
        questionsList.add(que16)

        val que17 = Question(
            17, "Which manager was famously said to have given players 'the Hairdryer Treatment'?",
            R.drawable.ic_flag_of_argentina,
            "Sir Alex Ferguson", "Pep Guardiola", "aland", "Frenkie de Jong",
            1
        )
        questionsList.add(que17)

        val que18 = Question(
            18, "Which manager was famously said to have given players 'the Hairdryer Treatment'?",
            R.drawable.ic_flag_of_argentina,
            "Sir Alex Ferguson", "Pep Guardiola", "aland", "Frenkie de Jong",
            1
        )
        questionsList.add(que18)

        val que19 = Question(
            19, "Which manager was famously said to have given players 'the Hairdryer Treatment'?",
            R.drawable.ic_flag_of_argentina,
            "Sir Alex Ferguson", "Pep Guardiola", "aland", "Frenkie de Jong",
            1
        )
        questionsList.add(que19)

        val que20 = Question(
            20, "Which manager was famously said to have given players 'the Hairdryer Treatment'?",
            R.drawable.ic_flag_of_argentina,
            "Sir Alex Ferguson", "Pep Guardiola", "aland", "Frenkie de Jong",
            1
        )
        questionsList.add(que20)

        return questionsList

    }

}