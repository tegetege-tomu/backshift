package com.example.backshift.model

/**
 * Represents a single flashcard in the app.
 * In Kotlin, 'data class' automatically generates getters, setters, 
 * equals(), hashCode(), and toString().
 */
data class Flashcard(
    val question: String,
    val answer: String,
    var isShowingQuestion: Boolean = true
) {
    fun toggleFace() {
        isShowingQuestion = !isShowingQuestion
    }

    val currentText: String
        get() = if (isShowingQuestion) question else answer
}
