package com.nemesis.quiz.model

/**
 *
 * @property question String the question being asked
 * @property answer String the answer to the question
 * @property wrongOption1 String the first wrong option
 * @property wrongOption2 String the second wrong option
 * @property wrongOption3 String the third wrong option
 * @property questionChosen Boolean result of whether user got question correct
 * @constructor
 */
class QuestionObject(
    val question: String, val answer: String, val wrongOption1: String,
    val wrongOption2: String,
    val wrongOption3: String, var questionChosen: Boolean
)