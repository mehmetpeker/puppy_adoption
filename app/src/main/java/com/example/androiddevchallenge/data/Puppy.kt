/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.data

enum class Gender {
    MALE, FEMALE
}

data class Puppy(
    val id: Int,
    val imageUrl: String,
    val name: String,
    val dogBreed: String,
    val age: Int,
    val gender: Gender,
    val detail: String
)

val puppies = listOf(
    Puppy(
        id = 0,
        "https://images.unsplash.com/photo-1563889362352-b0492c224f62?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80\"",
        "Akira",
        "Husky",
        age = 1,
        gender = Gender.MALE,
        detail = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin sit amet facilisis velit. Etiam nec mi interdum, malesuada enim a, pretium nunc. Maecenas fringilla massa ut quam volutpat facilisis. Maecenas eget pretium turpis, non aliquet ex. Suspendisse potenti. Suspendisse potenti. Ut erat nisl, facilisis porttitor magna id, aliquet viverra lorem. Proin sit amet pellentesque dui, quis feugiat eros. Proin ligula lectus, interdum et volutpat id, condimentum vel ex. Suspendisse sed molestie quam. Nulla vitae odio a sapien venenatis malesuada. Morbi dignissim orci nulla, a rutrum dolor scelerisque id. Integer pretium orci lacus, quis condimentum nisi congue ac.\n" +
            "\n" +
            "Praesent sollicitudin mi eleifend lectus sollicitudin dictum. Sed vestibulum, justo vitae maximus cursus, sem velit malesuada orci, quis imperdiet risus justo vitae metus. Integer hendrerit commodo pretium. Pellentesque tristique enim tellus, eu commodo eros elementum a. Cras eu nisi felis. Mauris ut bibendum velit. Sed dictum eros vel accumsan volutpat. Interdum et malesuada fames ac ante ipsum primis in faucibus."
    ),
    Puppy(
        id = 1,
        "https://images.unsplash.com/photo-1591856419156-3979c9edd30f?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1868&q=80",
        "Penny",
        "Cavalier King Charles Spaniel",
        age = 1,
        gender = Gender.FEMALE,
        detail = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin sit amet facilisis velit. Etiam nec mi interdum, malesuada enim a, pretium nunc. Maecenas fringilla massa ut quam volutpat facilisis. Maecenas eget pretium turpis, non aliquet ex. Suspendisse potenti. Suspendisse potenti. Ut erat nisl, facilisis porttitor magna id, aliquet viverra lorem. Proin sit amet pellentesque dui, quis feugiat eros. Proin ligula lectus, interdum et volutpat id, condimentum vel ex. Suspendisse sed molestie quam. Nulla vitae odio a sapien venenatis malesuada. Morbi dignissim orci nulla, a rutrum dolor scelerisque id. Integer pretium orci lacus, quis condimentum nisi congue ac.\n" +
            "\n" +
            "Praesent sollicitudin mi eleifend lectus sollicitudin dictum. Sed vestibulum, justo vitae maximus cursus, sem velit malesuada orci, quis imperdiet risus justo vitae metus. Integer hendrerit commodo pretium. Pellentesque tristique enim tellus, eu commodo eros elementum a. Cras eu nisi felis. Mauris ut bibendum velit. Sed dictum eros vel accumsan volutpat. Interdum et malesuada fames ac ante ipsum primis in faucibus."
    ),
    Puppy(
        id = 2,
        "https://images.unsplash.com/photo-1576873601810-e91efcc1451f?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=634&q=80",
        "Daisy",
        "Pomeranian ",
        age = 2,
        gender = Gender.FEMALE,
        detail = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin sit amet facilisis velit. Etiam nec mi interdum, malesuada enim a, pretium nunc. Maecenas fringilla massa ut quam volutpat facilisis. Maecenas eget pretium turpis, non aliquet ex. Suspendisse potenti. Suspendisse potenti. Ut erat nisl, facilisis porttitor magna id, aliquet viverra lorem. Proin sit amet pellentesque dui, quis feugiat eros. Proin ligula lectus, interdum et volutpat id, condimentum vel ex. Suspendisse sed molestie quam. Nulla vitae odio a sapien venenatis malesuada. Morbi dignissim orci nulla, a rutrum dolor scelerisque id. Integer pretium orci lacus, quis condimentum nisi congue ac.\n" +
            "\n" +
            "Praesent sollicitudin mi eleifend lectus sollicitudin dictum. Sed vestibulum, justo vitae maximus cursus, sem velit malesuada orci, quis imperdiet risus justo vitae metus. Integer hendrerit commodo pretium. Pellentesque tristique enim tellus, eu commodo eros elementum a. Cras eu nisi felis. Mauris ut bibendum velit. Sed dictum eros vel accumsan volutpat. Interdum et malesuada fames ac ante ipsum primis in faucibus."
    ),
    Puppy(
        id = 3,
        "https://images.unsplash.com/photo-1590634332133-2c30a2687814?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80",
        "Frank",
        "Pug",
        age = 1,
        gender = Gender.MALE,
        detail = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin sit amet facilisis velit. Etiam nec mi interdum, malesuada enim a, pretium nunc. Maecenas fringilla massa ut quam volutpat facilisis. Maecenas eget pretium turpis, non aliquet ex. Suspendisse potenti. Suspendisse potenti. Ut erat nisl, facilisis porttitor magna id, aliquet viverra lorem. Proin sit amet pellentesque dui, quis feugiat eros. Proin ligula lectus, interdum et volutpat id, condimentum vel ex. Suspendisse sed molestie quam. Nulla vitae odio a sapien venenatis malesuada. Morbi dignissim orci nulla, a rutrum dolor scelerisque id. Integer pretium orci lacus, quis condimentum nisi congue ac.\n" +
            "\n" +
            "Praesent sollicitudin mi eleifend lectus sollicitudin dictum. Sed vestibulum, justo vitae maximus cursus, sem velit malesuada orci, quis imperdiet risus justo vitae metus. Integer hendrerit commodo pretium. Pellentesque tristique enim tellus, eu commodo eros elementum a. Cras eu nisi felis. Mauris ut bibendum velit. Sed dictum eros vel accumsan volutpat. Interdum et malesuada fames ac ante ipsum primis in faucibus."
    ),
    Puppy(
        id = 4,
        "https://images.unsplash.com/photo-1591160690555-5debfba289f0?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=700&q=80",
        "Stella",
        "Golden Retriever",
        age = 1,
        gender = Gender.FEMALE,
        detail = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin sit amet facilisis velit. Etiam nec mi interdum, malesuada enim a, pretium nunc. Maecenas fringilla massa ut quam volutpat facilisis. Maecenas eget pretium turpis, non aliquet ex. Suspendisse potenti. Suspendisse potenti. Ut erat nisl, facilisis porttitor magna id, aliquet viverra lorem. Proin sit amet pellentesque dui, quis feugiat eros. Proin ligula lectus, interdum et volutpat id, condimentum vel ex. Suspendisse sed molestie quam. Nulla vitae odio a sapien venenatis malesuada. Morbi dignissim orci nulla, a rutrum dolor scelerisque id. Integer pretium orci lacus, quis condimentum nisi congue ac.\n" +
            "\n" +
            "Praesent sollicitudin mi eleifend lectus sollicitudin dictum. Sed vestibulum, justo vitae maximus cursus, sem velit malesuada orci, quis imperdiet risus justo vitae metus. Integer hendrerit commodo pretium. Pellentesque tristique enim tellus, eu commodo eros elementum a. Cras eu nisi felis. Mauris ut bibendum velit. Sed dictum eros vel accumsan volutpat. Interdum et malesuada fames ac ante ipsum primis in faucibus."
    ),
    Puppy(
        id = 5,
        "https://images.unsplash.com/photo-1563889362352-b0492c224f62?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80\"",
        "Akira",
        "Husky",
        age = 1,
        gender = Gender.MALE,
        detail = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin sit amet facilisis velit. Etiam nec mi interdum, malesuada enim a, pretium nunc. Maecenas fringilla massa ut quam volutpat facilisis. Maecenas eget pretium turpis, non aliquet ex. Suspendisse potenti. Suspendisse potenti. Ut erat nisl, facilisis porttitor magna id, aliquet viverra lorem. Proin sit amet pellentesque dui, quis feugiat eros. Proin ligula lectus, interdum et volutpat id, condimentum vel ex. Suspendisse sed molestie quam. Nulla vitae odio a sapien venenatis malesuada. Morbi dignissim orci nulla, a rutrum dolor scelerisque id. Integer pretium orci lacus, quis condimentum nisi congue ac.\n" +
            "\n" +
            "Praesent sollicitudin mi eleifend lectus sollicitudin dictum. Sed vestibulum, justo vitae maximus cursus, sem velit malesuada orci, quis imperdiet risus justo vitae metus. Integer hendrerit commodo pretium. Pellentesque tristique enim tellus, eu commodo eros elementum a. Cras eu nisi felis. Mauris ut bibendum velit. Sed dictum eros vel accumsan volutpat. Interdum et malesuada fames ac ante ipsum primis in faucibus."
    ),
    Puppy(
        id = 6,
        "https://images.unsplash.com/photo-1591856419156-3979c9edd30f?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1868&q=80",
        "Penny",
        "Cavalier King Charles Spaniel",
        age = 1,
        gender = Gender.FEMALE,
        detail = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin sit amet facilisis velit. Etiam nec mi interdum, malesuada enim a, pretium nunc. Maecenas fringilla massa ut quam volutpat facilisis. Maecenas eget pretium turpis, non aliquet ex. Suspendisse potenti. Suspendisse potenti. Ut erat nisl, facilisis porttitor magna id, aliquet viverra lorem. Proin sit amet pellentesque dui, quis feugiat eros. Proin ligula lectus, interdum et volutpat id, condimentum vel ex. Suspendisse sed molestie quam. Nulla vitae odio a sapien venenatis malesuada. Morbi dignissim orci nulla, a rutrum dolor scelerisque id. Integer pretium orci lacus, quis condimentum nisi congue ac.\n" +
            "\n" +
            "Praesent sollicitudin mi eleifend lectus sollicitudin dictum. Sed vestibulum, justo vitae maximus cursus, sem velit malesuada orci, quis imperdiet risus justo vitae metus. Integer hendrerit commodo pretium. Pellentesque tristique enim tellus, eu commodo eros elementum a. Cras eu nisi felis. Mauris ut bibendum velit. Sed dictum eros vel accumsan volutpat. Interdum et malesuada fames ac ante ipsum primis in faucibus."
    ),
    Puppy(
        id = 7,
        "https://images.unsplash.com/photo-1576873601810-e91efcc1451f?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=634&q=80",
        "Daisy",
        "Pomeranian ",
        age = 2,
        gender = Gender.FEMALE,
        detail = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin sit amet facilisis velit. Etiam nec mi interdum, malesuada enim a, pretium nunc. Maecenas fringilla massa ut quam volutpat facilisis. Maecenas eget pretium turpis, non aliquet ex. Suspendisse potenti. Suspendisse potenti. Ut erat nisl, facilisis porttitor magna id, aliquet viverra lorem. Proin sit amet pellentesque dui, quis feugiat eros. Proin ligula lectus, interdum et volutpat id, condimentum vel ex. Suspendisse sed molestie quam. Nulla vitae odio a sapien venenatis malesuada. Morbi dignissim orci nulla, a rutrum dolor scelerisque id. Integer pretium orci lacus, quis condimentum nisi congue ac.\n" +
            "\n" +
            "Praesent sollicitudin mi eleifend lectus sollicitudin dictum. Sed vestibulum, justo vitae maximus cursus, sem velit malesuada orci, quis imperdiet risus justo vitae metus. Integer hendrerit commodo pretium. Pellentesque tristique enim tellus, eu commodo eros elementum a. Cras eu nisi felis. Mauris ut bibendum velit. Sed dictum eros vel accumsan volutpat. Interdum et malesuada fames ac ante ipsum primis in faucibus."
    ),
    Puppy(
        id = 8,
        "https://images.unsplash.com/photo-1590634332133-2c30a2687814?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80",
        "Frank",
        "Pug",
        age = 1,
        gender = Gender.MALE,
        detail = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin sit amet facilisis velit. Etiam nec mi interdum, malesuada enim a, pretium nunc. Maecenas fringilla massa ut quam volutpat facilisis. Maecenas eget pretium turpis, non aliquet ex. Suspendisse potenti. Suspendisse potenti. Ut erat nisl, facilisis porttitor magna id, aliquet viverra lorem. Proin sit amet pellentesque dui, quis feugiat eros. Proin ligula lectus, interdum et volutpat id, condimentum vel ex. Suspendisse sed molestie quam. Nulla vitae odio a sapien venenatis malesuada. Morbi dignissim orci nulla, a rutrum dolor scelerisque id. Integer pretium orci lacus, quis condimentum nisi congue ac.\n" +
            "\n" +
            "Praesent sollicitudin mi eleifend lectus sollicitudin dictum. Sed vestibulum, justo vitae maximus cursus, sem velit malesuada orci, quis imperdiet risus justo vitae metus. Integer hendrerit commodo pretium. Pellentesque tristique enim tellus, eu commodo eros elementum a. Cras eu nisi felis. Mauris ut bibendum velit. Sed dictum eros vel accumsan volutpat. Interdum et malesuada fames ac ante ipsum primis in faucibus."
    ),
    Puppy(
        id = 9,
        "https://images.unsplash.com/photo-1591160690555-5debfba289f0?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=700&q=80",
        "Stella",
        "Golden Retriever",
        age = 1,
        gender = Gender.FEMALE,
        detail = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin sit amet facilisis velit. Etiam nec mi interdum, malesuada enim a, pretium nunc. Maecenas fringilla massa ut quam volutpat facilisis. Maecenas eget pretium turpis, non aliquet ex. Suspendisse potenti. Suspendisse potenti. Ut erat nisl, facilisis porttitor magna id, aliquet viverra lorem. Proin sit amet pellentesque dui, quis feugiat eros. Proin ligula lectus, interdum et volutpat id, condimentum vel ex. Suspendisse sed molestie quam. Nulla vitae odio a sapien venenatis malesuada. Morbi dignissim orci nulla, a rutrum dolor scelerisque id. Integer pretium orci lacus, quis condimentum nisi congue ac.\n" +
            "\n" +
            "Praesent sollicitudin mi eleifend lectus sollicitudin dictum. Sed vestibulum, justo vitae maximus cursus, sem velit malesuada orci, quis imperdiet risus justo vitae metus. Integer hendrerit commodo pretium. Pellentesque tristique enim tellus, eu commodo eros elementum a. Cras eu nisi felis. Mauris ut bibendum velit. Sed dictum eros vel accumsan volutpat. Interdum et malesuada fames ac ante ipsum primis in faucibus."
    ),
)
