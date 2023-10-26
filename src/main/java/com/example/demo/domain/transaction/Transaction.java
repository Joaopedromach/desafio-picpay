package com.example.demo.domain.transaction;
import com.example.demo.domain.user.User;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.math.BigDecimal;

import java.time.LocalDateTime;

@Entity(name = "transactions")
@Table(name = "transactions")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;

    @JdbcTypeCode(SqlTypes.JSON)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payer_id")
    private User payer;

    @JdbcTypeCode(SqlTypes.JSON)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payee_id")
    private User payee;

    private LocalDateTime transactiontime;


}
