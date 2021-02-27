package com.example.androiddevchallenge.data
enum class Gender{
    MALE,FEMALE
}
data class Puppy(
    val imageUrl:String,
    val name:String,
    val dogBreed:String,
    val age:Int,
    val gender:Gender
)
val puppies =listOf(
    Puppy(
        "https://images.unsplash.com/photo-1591160690555-5debfba289f0?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=700&q=80",
        "Alicy Moire",
        "Golden",
        age = 2,
        gender = Gender.FEMALE
    ),  Puppy(
        "https://images.unsplash.com/photo-1560807707-8cc77767d783?ixid=MXwxMjA3fDB8MHxzZWFyY2h8Mnx8cHVwcHl8ZW58MHx8MHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60",
        "Alicy Moire",
        "Golden Retriever",
        age = 2,
        gender = Gender.MALE
    ),  Puppy(
"https://images.unsplash.com/photo-1593134257782-e89567b7718a?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxzZWFyY2h8M3x8cHVwcHl8ZW58MHx8MHw%3D&auto=format&fit=crop&w=500&q=60",
        "Alicy Moire",
        "Golden Retriever",
        age = 2,
        gender = Gender.MALE
    ),  Puppy(
       "https://images.unsplash.com/photo-1600804340584-c7db2eacf0bf?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxzZWFyY2h8NXx8cHVwcHl8ZW58MHx8MHw%3D&auto=format&fit=crop&w=500&q=60",
        "Alicy Moire",
        "Golden Retriever",
        age = 2,
        gender = Gender.FEMALE
    ),  Puppy(
        "https://images.unsplash.com/photo-1591160690555-5debfba289f0?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=700&q=80",
        "Alicy Moire",
        "Golden Retriever",
        age = 2,
        gender = Gender.MALE
    ),  Puppy(
        "https://images.unsplash.com/photo-1591160690555-5debfba289f0?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=700&q=80",
        "Alicy Moire",
        "Golden Retriever",
        age = 2,
        gender = Gender.MALE
    ),  Puppy(
        "https://images.unsplash.com/photo-1591160690555-5debfba289f0?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=700&q=80",
        "Alicy Moire",
        "Golden Retriever",
        age = 2,
        gender = Gender.MALE
    ),  Puppy(
        "https://images.unsplash.com/photo-1591160690555-5debfba289f0?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=700&q=80",
        "Alicy Moire",
        "Golden Retriever",
        age = 2,
        gender = Gender.MALE
    ),
)