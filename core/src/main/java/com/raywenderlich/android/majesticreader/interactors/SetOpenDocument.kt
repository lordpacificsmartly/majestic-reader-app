package com.raywenderlich.android.majesticreader.interactors

import com.raywenderlich.android.majesticreader.DocumentRepository
import com.raywenderlich.android.majesticreader.domain.Document

class SetOpenDocument(private val documentRepository: DocumentRepository) {
    operator fun invoke(document: Document) = documentRepository.setOpenDocument(document)
}