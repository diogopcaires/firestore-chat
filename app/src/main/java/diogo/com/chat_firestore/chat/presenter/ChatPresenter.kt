package diogo.com.chat_firestore.chat.presenter

import diogo.com.chat_firestore.data.chat.Message


interface ChatPresenter {
    fun subscribeChatMessages()
    fun sendMessage(message: String, onComplete: (message: Message) -> Unit, onError: (throwable: Throwable) -> Unit)
}