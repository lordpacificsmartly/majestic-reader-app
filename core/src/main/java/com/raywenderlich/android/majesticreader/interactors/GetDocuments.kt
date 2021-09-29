package com.raywenderlich.android.majesticreader.interactors

import com.raywenderlich.android.majesticreader.DocumentRepository

class GetDocuments(private val documentRepository: DocumentRepository) {
    suspend operator fun invoke() = documentRepository.getDocuments()
}