package lt.eimis.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Role {
    private String name;
    private String description;
    private Integer accessLevel;
}
