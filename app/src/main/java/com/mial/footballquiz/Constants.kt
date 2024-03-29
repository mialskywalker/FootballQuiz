package com.mial.footballquiz

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions():ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "Which club has won the most Champions League titles?",
            R.drawable.que1,
            "FC Barcelona", "Real Madrid", "Bayern Munich", "AC Milan",
            2
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "When was the first Premier League played?",
            R.drawable.que2,
            "1985/86", "1943/44", "1996/97", "1992/93",
            4
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "Which Barcelona player was jailed after it was found that his passport was fake?",
            R.drawable.que3,
            "Lionel Messi", "Samuel Eto'o", "Dani Alves", "Ronaldinho",
            4
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "Which footballer had a galaxy named after him?",
            R.drawable.que4,
            "Cristiano Ronaldo", "Diego Maradona", "Lionel Messi", "Pele",
            1
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "Which player won the World Cup Young Player award in 2018?",
            R.drawable.que5,
            "Vinicius Jr", "Kylian Mbappe", "Erling Haaland", "Frenkie de Jong",
            2
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "Which manager was famously said to have given players 'the Hairdryer Treatment'?",
            R.drawable.que6,
            "Sir Alex Ferguson", "Pep Guardiola", "Jose Mourinho", "Manuel Pellegrini",
            1
        )
        questionsList.add(que6)

        val que7 = Question(
            7, "In video game FIFA 21, team Piemonte Calcio represents which real-life club?",
            R.drawable.que7,
            "Chelsea", "Juventus", "Paris Saint-Germain", "S.S. Lazio",
            2
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "Which outfield player appeared in the Champions League final in three different decades?",
            R.drawable.que8,
            "Rio Ferdinand", "Cristiano Ronaldo", "Zinedine Zidane", "Ryan Giggs",
            4
        )
        questionsList.add(que8)

        val que9 = Question(
            9, "Who is the only player to win the Champions League with three different clubs?",
            R.drawable.que9,
            "Gareth Bale", "Ricardo Kaka", "Clarence Seedorf", "Diego Maradona",
            3
        )
        questionsList.add(que9)

        val que10 = Question(
            10, "Which is the world’s largest football ground?",
            R.drawable.que10,
            "Camp Nou", "Rungrado 1st of May Stadium", "Stamford Bridge", "Wembley Stadium",
            2
        )
        questionsList.add(que10)

        val que11 = Question(
            11, "Which country won the first World Cup Championship?",
            R.drawable.que11,
            "Uruguay", "Argentina", "Brazil", "England",
            1
        )
        questionsList.add(que11)

        val que12 = Question(
            12, "Which team won the Champions League 2006/07 trophy?",
            R.drawable.que12,
            "AC Milan", "FC Barcelona", "Manchester United", "Liverpool FC",
            1
        )
        questionsList.add(que12)

        val que13 = Question(
            13, "Who was chosen as the best goalkeeper at the 2010 World Cup?",
            R.drawable.que13,
            "Manuel Neuer", "Maarten Stekelenburg", "Gianluigi Buffon", "Iker Casillas",
            4
        )
        questionsList.add(que13)

        val que14 = Question(
            14, "What was the transfer fee for Neymar to PSG?",
            R.drawable.que14,
            "135 million", "222 million", "230 million", "190 million",
            2
        )
        questionsList.add(que14)

        val que15 = Question(
            15, "Which one of these players wasn't in the top 3 for the 2010 Ballon d'Or?",
            R.drawable.que15,
            "Cristiano Ronaldo", "Xavi Hernandez", "Andres Iniesta", "Lionel Messi",
            1
        )
        questionsList.add(que15)

        val que16 = Question(
            16, "Who scored the most goals in the UEFA Euro 2016?",
            R.drawable.que16,
            "Romelo Lukaku", "Alvaro Morata", "Gareth Bale", "Antoine Griezmann",
            4
        )
        questionsList.add(que16)

        val que17 = Question(
            17, "Which of these german teams was coached by Jurgen Klopp?",
            R.drawable.que17,
            "Bayern Munich", "Bayer Leverkusen", "Mainz 05", "Schalke 04",
            3
        )
        questionsList.add(que17)

        val que18 = Question(
            18, "Who introduced the tiki-taka style of play?",
            R.drawable.que18,
            "Luis Enrique", "Frank Rijkaard", "Johan Cruyff", "Pep Guardiola",
            3
        )
        questionsList.add(que18)

        val que19 = Question(
            19, "With 202 clean sheets, which goalkeeper has the best record in the Premier League?",
            R.drawable.que19,
            "Edwin Van der Sar", "Petr Cech", "Pepe Reina", "Alisson Becker",
            2
        )
        questionsList.add(que19)

        val que20 = Question(
            20, "The record number of World Cup goals is 16, scored by who?",
            R.drawable.que20,
            "Ronaldo", "Gerd Muller", "Just Fontaine", "Miroslav Klose",
            4
        )
        questionsList.add(que20)

        return questionsList

    }

}