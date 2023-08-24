package com.iagocarvalho.eletriccarappdioxml.data

import com.iagocarvalho.eletriccarappdioxml.domain.Carro

class carFectory {
    val list = listOf<Carro>(
        Carro(
            id = 1,
            preco = "R$ 3000",
            bateria = "300KVh",
            potencia = "200CV",
            recarga = "23min",
            urlphoto = "google.com",
        )
    )
}