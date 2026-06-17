package com.itau.cofrinho_api.domain

import jakarta.annotation.Nonnull
import jakarta.annotation.Nullable
import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import java.math.BigDecimal
import java.time.LocalDateTime


@Entity
@Table(name="piggy_bank")
class PiggyBank (
    @Id
    @Column(name="id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "name", nullable = false, length = 255)
    var name: String,

    @Column(name = "target_amount", nullable = false, precision = 19, scale = 2)
    var targetAmount: BigDecimal,

    @Column(name = "current_balance", nullable = false, precision = 19, scale = 2)
    var currentBalance: BigDecimal = BigDecimal.ZERO,

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    val createdAt: LocalDateTime? = null

    )