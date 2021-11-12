package com.mial.footballquiz

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions():ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "Which team won the Champions League in 2006/07?",
            R.drawable.ic_flag_of_argentina,
            "FC Barcelona", "AC Milan", "Manchester United", "FC Porto",
            3
        )
        questionsList.add(que1)
        // TODO Questions

        return questionsList

    }

}