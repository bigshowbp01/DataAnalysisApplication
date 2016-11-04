package com.company.test.test.test.cow.generated;

import com.company.test.test.test.cow.Cow;
import com.company.test.test.test.cow.CowManager;
import com.speedment.component.ProjectComponent;
import com.speedment.config.db.Table;
import com.speedment.enterprise.offheapreadonlycache.manager.HasSerializer;
import com.speedment.internal.core.manager.sql.SqlManager;
import com.speedment.util.tuple.Tuple1;
import javax.annotation.Generated;
import org.mapdb.Serializer;

/**
 * The generated base manager representing an entity (for example, a row) in
 * the Table test.test.test.cow.
 * <p>
 * This file has been automatically generated by Ext Speeder. Any changes
 * made to it will be overwritten.
 * 
 * @author Ext Speeder
 */
@Generated("Ext Speeder")
public interface GeneratedCowManager extends HasSerializer<Cow>, SqlManager<Cow> {
    
    @Override
    default Serializer<Cow> newSerializer() {
        return new GeneratedCowSerializerImpl(this);
    }
    
    @Override
    default Integer primaryKeyFor(Cow entity) {
        return entity.getId();
    }
    
    @Override
    default Table getTable() {
        return speedment().get(ProjectComponent.class).getProject().findTableByName("test.test.cow");
    }
    
    @Override
    default Class<CowManager> getManagerClass() {
        return CowManager.class;
    }
    
    @Override
    default Class<Cow> getEntityClass() {
        return Cow.class;
    }
    
    @Override
    Tuple1<Class<Integer>> getPrimaryKeyClasses();
}