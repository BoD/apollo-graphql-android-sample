package com.example.graphqlsample.ui.repository.adapter.search

data class SearchRepositoryUiModel(
    val name: String,
    val ownerType: OwnerType,
    val ownerName: String,
    val ownerUserBio: String?
)

enum class OwnerType {
    USER, ORGANIZATION
}
