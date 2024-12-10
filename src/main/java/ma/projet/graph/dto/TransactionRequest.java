package ma.projet.graph.dto;
import java.util.Date;
import ma.projet.graph.entities.TypeTransaction; // Adjust package name if needed

import lombok.Data;

@Data
public class TransactionRequest {
    private Long compteId;
    private double montant;
    private Date date;
    private TypeTransaction type;
}