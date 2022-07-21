package br.com.zup.movieflix.register.viewmodel

import br.com.zup.movieflix.register.model.RegisterModel
import br.com.zup.movieflix.register.repositorio.RegisterRepository
import org.junit.Assert.*

import org.junit.Test

class RegisterViewModelTest {

    @Test
    fun registerUser_returnUser() {
        val user = RegisterModel(
            userName = "Felipe",
            email = "felipe.dearaujo@zup.com.br",
            password = "professorMaisHumildeDoMundo"
        )

        val result = RegisterRepository().registerUser(user)

        assertEquals(result.userName, "Felipe")
        assertEquals(result.email, "felipe.dearaujo@zup.com.br")
        assertEquals(result.password, "professorMaisHumildeDoMundo")
    }
}