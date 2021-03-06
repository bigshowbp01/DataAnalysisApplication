package com.company.test.test.test.indp.generated;

import com.company.test.test.test.indp.Indp;
import com.speedment.Speedment;
import com.speedment.internal.core.code.AbstractBaseEntity;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;
import javax.annotation.Generated;

/**
 * The generated base implementation representing an entity (for example, a
 * row) in the Table test.test.test.indp.
 * <p>
 * This file has been automatically generated by Ext Speeder. Any changes
 * made to it will be overwritten.
 * 
 * @author Ext Speeder
 */
@Generated("Ext Speeder")
public abstract class GeneratedIndpImpl extends AbstractBaseEntity<Indp> implements Indp {
    
    private Integer id;
    private String description;
    
    protected GeneratedIndpImpl() {
        
    }
    
    @Override
    public Integer getId() {
        return id;
    }
    
    @Override
    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }
    
    @Override
    public final Indp setId(Integer id) {
        this.id = id;
        return this;
    }
    
    @Override
    public final Indp setDescription(String description) {
        this.description = description;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "+Objects.toString(getId()));
        sj.add("description = "+Objects.toString(getDescription().orElse(null)));
        return "IndpImpl "+sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Indp)) { return false; }
        final Indp thatIndp = (Indp)that;
        if (!Objects.equals(this.getId(), thatIndp.getId())) {return false; }
        if (!Objects.equals(this.getDescription(), thatIndp.getDescription())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(getDescription());
        return hash;
    }
    
    @Override
    public Class<Indp> entityClass() {
        return Indp.class;
    }
}