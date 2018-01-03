package de.htwg.se.learn_duel.model.impl

import java.security.InvalidParameterException

import de.htwg.se.learn_duel.model.{Game => GameTrait, Player => PlayerTrait, Question => QuestionTrait}

case class Game(
       var helpText: String = "",
       var players: List[PlayerTrait] = List(),
       var questions: List[QuestionTrait] = List(),
       var currentQuestion: Option[QuestionTrait] = None,
       var currentQuestionTime: Option[Int] = None
) extends GameTrait {
    addPlayer(new Player("Player1"))

    override def addPlayer(player: PlayerTrait): Unit = players = players :+ player

    override def removePlayer(player: PlayerTrait): Unit = players = players.filter(_ != player)

    override def playerCount(): Int = players.size

    override def addQuestion(question: QuestionTrait): Unit = questions :+ question

    override def removeQuestion(question: QuestionTrait): Unit = questions = questions.filter(_ != question)

    override def questionCount(): Int = questions.size
}


