package lt.eimis.entities;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Simple class for demonstration purposes. We do not generate getters/setters/toString on purpose
 */
@ToString(callSuper=false, includeFieldNames=true)
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Getter
    @Setter
    private String firstName;
    @Getter
    @Setter
    private String lastName;
}
