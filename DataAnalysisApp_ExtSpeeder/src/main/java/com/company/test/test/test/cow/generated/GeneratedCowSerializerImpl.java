package com.company.test.test.test.cow.generated;

import com.company.test.test.test.cow.Cow;
import com.speedment.enterprise.core.util.BitSetUtil;
import com.speedment.enterprise.offheapreadonlycache.entity.AbstractEntitySerializer;
import com.speedment.enterprise.offheapreadonlycache.internal.serializer.SerializerFactory;
import com.speedment.manager.Manager;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import javax.annotation.Generated;
import org.mapdb.Serializer;

/**
 * A {@link org.mapdb.Serializer} class for table {@link
 * com.speedment.config.db.Table} named cow.
 * <p>
 * This file has been automatically generated by Ext Speeder. Any changes
 * made to it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Ext Speeder")
public class GeneratedCowSerializerImpl extends AbstractEntitySerializer<Cow> {
    
    protected final static long serialVersionUID = -329505906;
    private final static Serializer<Integer> ID_SERIALIZER = SerializerFactory.serializerOf(Integer.class);
    private final static Serializer<String> DESCRIPTION_SERIALIZER = SerializerFactory.serializerOf(String.class);
    
    public GeneratedCowSerializerImpl(Manager<Cow> manager) {
        super(manager);
    }
    
    @Override
    public void serialize(final DataOutput out, final Cow cow) throws IOException {
        final long[] bits = new long[1];
        if (!cow.getDescription().isPresent()) BitSetUtil.set(bits, 0);
        out.writeLong(bits[0]);
        out.writeInt(cow.getId());
        if (cow.getDescription().isPresent()) out.writeUTF(cow.getDescription().get());
    }
    
    @Override
    public Cow deserialize(final DataInput in, final int available) throws IOException {
        final Cow cow = manager.newEmptyEntity();
        final long[] bits = new long[1];
        bits[0] = in.readLong();
        cow.setId(in.readInt());
        if (!BitSetUtil.get0(bits)) cow.setDescription(in.readUTF());
        return cow;
    }
}