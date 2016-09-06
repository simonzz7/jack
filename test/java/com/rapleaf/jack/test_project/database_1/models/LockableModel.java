
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.rapleaf.jack.test_project.database_1.models;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.rapleaf.jack.AssociationType;
import com.rapleaf.jack.AttributesWithId;
import com.rapleaf.jack.BelongsToAssociation;
import com.rapleaf.jack.DefaultAssociationMetadata;
import com.rapleaf.jack.HasManyAssociation;
import com.rapleaf.jack.HasOneAssociation;
import com.rapleaf.jack.IAssociationMetadata;
import com.rapleaf.jack.IModelAssociationMetadata;
import com.rapleaf.jack.ModelIdWrapper;
import com.rapleaf.jack.ModelWithId;
import com.rapleaf.jack.queries.AbstractTable;
import com.rapleaf.jack.queries.Column;

import com.rapleaf.jack.test_project.IDatabases;
import com.rapleaf.jack.util.JackUtility;

public class LockableModel extends ModelWithId<LockableModel, IDatabases> implements Comparable<LockableModel>{
  
  public static final long serialVersionUID = 2267084843778072603L;

  public static class Tbl extends AbstractTable<LockableModel.Attributes, LockableModel> {
    public final Column<Long> ID;
    public final Column<Integer> LOCK_VERSION;
    public final Column<String> MESSAGE;
    public final Column<Long> CREATED_AT;
    public final Column<Long> UPDATED_AT;

    private Tbl(String alias) {
      super("lockable_models", alias, LockableModel.Attributes.class, LockableModel.class);
      this.ID = Column.fromId(alias);
      this.LOCK_VERSION = Column.fromField(alias, _Fields.lock_version, Integer.class);
      this.MESSAGE = Column.fromField(alias, _Fields.message, String.class);
      this.CREATED_AT = Column.fromTimestamp(alias, _Fields.created_at);
      this.UPDATED_AT = Column.fromTimestamp(alias, _Fields.updated_at);
      Collections.addAll(this.allColumns, ID, LOCK_VERSION, MESSAGE, CREATED_AT, UPDATED_AT);
    }

    public static Tbl as(String alias) {
      return new Tbl(alias);
    }
  }

  public static final Tbl TBL = new Tbl("lockable_models");
  public static final Column<Long> ID = TBL.ID;
  public static final Column<Integer> LOCK_VERSION = TBL.LOCK_VERSION;
  public static final Column<String> MESSAGE = TBL.MESSAGE;
  public static final Column<Long> CREATED_AT = TBL.CREATED_AT;
  public static final Column<Long> UPDATED_AT = TBL.UPDATED_AT;

  private final Attributes attributes;

  private transient LockableModel.Id cachedTypedId;

  // Associations

  public enum _Fields {
    lock_version,
    message,
    created_at,
    updated_at,
  }

  @Override
  public LockableModel.Id getTypedId() {
    if (cachedTypedId == null) {
      cachedTypedId = new LockableModel.Id(this.getId());
    }
    return cachedTypedId;
  }

  public LockableModel(long id, final int lock_version, final String message, final long created_at, final long updated_at, IDatabases databases) {
    super(databases);
    attributes = new Attributes(id, lock_version, message, created_at, updated_at);
  }

  public LockableModel(long id, final int lock_version, final String message, final long created_at, final long updated_at) {
    super(null);
    attributes = new Attributes(id, lock_version, message, created_at, updated_at);
  }
  public LockableModel(long id, final int lock_version, final String message, final long updated_at, IDatabases databases) {
    super(databases);
    attributes = new Attributes(id, lock_version, message, updated_at);
  }

  public LockableModel(long id, final int lock_version, final String message, final long updated_at) {
    super(null);
    attributes = new Attributes(id, lock_version, message, updated_at);
  }
  
  public LockableModel(long id, final int lock_version, final long created_at, final long updated_at, IDatabases databases) {
    super(databases);
    attributes = new Attributes(id, lock_version, created_at, updated_at);
  }

  public LockableModel(long id, final int lock_version, final long created_at, final long updated_at) {
    super(null);
    attributes = new Attributes(id, lock_version, created_at, updated_at);
  }
   
  public LockableModel(long id, final int lock_version, final long updated_at, IDatabases databases) {
    super(databases);
    attributes = new Attributes(id, lock_version, updated_at);
  }

  public LockableModel(long id, final int lock_version, final long updated_at) {
    super(null);
    attributes = new Attributes(id, lock_version, updated_at);
  }

  public static LockableModel newDefaultInstance(long id) {
    return new LockableModel(id, 0, 0L, 0L);
  }

  public LockableModel(Attributes attributes, IDatabases databases) {
    super(databases);
    this.attributes = attributes;

    if (databases != null) {
    }
  }

  public LockableModel(Attributes attributes) {
    this(attributes, (IDatabases) null);
  }

  public LockableModel(long id, Map<Enum, Object> fieldsMap) {
    super(null);
    attributes = new Attributes(id, fieldsMap);
  }

  public LockableModel (LockableModel other) {
    this(other, (IDatabases)null);
  }

  public LockableModel (LockableModel other, IDatabases databases) {
    super(databases);
    attributes = new Attributes(other.getAttributes());

    if (databases != null) {
    }
  }

  public Attributes getAttributes() {
    return attributes;
  }

  public int getLockVersion() {
    return attributes.getLockVersion();
  }

  public LockableModel setLockVersion(int newval) {
    attributes.setLockVersion(newval);
    cachedHashCode = 0;
    return this;
  }

  public String getMessage() {
    return attributes.getMessage();
  }

  public LockableModel setMessage(String newval) {
    attributes.setMessage(newval);
    cachedHashCode = 0;
    return this;
  }

  public long getCreatedAt() {
    return attributes.getCreatedAt();
  }

  public LockableModel setCreatedAt(long newval) {
    attributes.setCreatedAt(newval);
    cachedHashCode = 0;
    return this;
  }

  public long getUpdatedAt() {
    return attributes.getUpdatedAt();
  }

  public LockableModel setUpdatedAt(long newval) {
    attributes.setUpdatedAt(newval);
    cachedHashCode = 0;
    return this;
  }

  public void setField(_Fields field, Object value) {
    switch (field) {
      case lock_version:
        setLockVersion((Integer)value);
        break;
      case message:
        setMessage((String)value);
        break;
      case created_at:
        setCreatedAt((Long)value);
        break;
      case updated_at:
        setUpdatedAt((Long)value);
        break;
      default:
        throw new IllegalStateException("Invalid field: " + field);
    }
  }
  
  public void setField(String fieldName, Object value) {
    if (fieldName.equals("lock_version")) {
      setLockVersion((Integer)  value);
      return;
    }
    if (fieldName.equals("message")) {
      setMessage((String)  value);
      return;
    }
    if (fieldName.equals("created_at")) {
      setCreatedAt((Long)  value);
      return;
    }
    if (fieldName.equals("updated_at")) {
      setUpdatedAt((Long)  value);
      return;
    }
    throw new IllegalStateException("Invalid field: " + fieldName);
  }

  public static Class getFieldType(_Fields field) {
    switch (field) {
      case lock_version:
        return int.class;
      case message:
        return String.class;
      case created_at:
        return long.class;
      case updated_at:
        return long.class;
      default:
        throw new IllegalStateException("Invalid field: " + field);
    }    
  }

  public static Class getFieldType(String fieldName) {    
    if (fieldName.equals("lock_version")) {
      return int.class;
    }
    if (fieldName.equals("message")) {
      return String.class;
    }
    if (fieldName.equals("created_at")) {
      return long.class;
    }
    if (fieldName.equals("updated_at")) {
      return long.class;
    }
    throw new IllegalStateException("Invalid field name: " + fieldName);
  }

  @Override
  public Object getField(String fieldName) {
    if (fieldName.equals("id")) {
      return getId();
    }
    if (fieldName.equals("lock_version")) {
      return getLockVersion();
    }
    if (fieldName.equals("message")) {
      return getMessage();
    }
    if (fieldName.equals("created_at")) {
      return getCreatedAt();
    }
    if (fieldName.equals("updated_at")) {
      return getUpdatedAt();
    }
    throw new IllegalStateException("Invalid field name: " + fieldName);
  }

  public Object getField(_Fields field) {
    switch (field) {
      case lock_version:
        return getLockVersion();
      case message:
        return getMessage();
      case created_at:
        return getCreatedAt();
      case updated_at:
        return getUpdatedAt();
    }
    throw new IllegalStateException("Invalid field: " + field);
  }

  public boolean hasField(String fieldName) {
    if (fieldName.equals("id")) {
      return true;
    }
    if (fieldName.equals("lock_version")) {
      return true;
    }
    if (fieldName.equals("message")) {
      return true;
    }
    if (fieldName.equals("created_at")) {
      return true;
    }
    if (fieldName.equals("updated_at")) {
      return true;
    }
    return false;
  }

  public static Object getDefaultValue(_Fields field) {
    switch (field) {
      case lock_version:
        return 0;
      case message:
        return null;
      case created_at:
        return null;
      case updated_at:
        return null;
    }
    throw new IllegalStateException("Invalid field: " + field);
  }

  @Override
  public Set<Enum> getFieldSet() {
    Set set = EnumSet.allOf(_Fields.class);
    return set;
  }

  @Override
  public LockableModel getCopy() {
    return getCopy(databases);
  }

  @Override
  public LockableModel getCopy(IDatabases databases) {
    return new LockableModel(this, databases);
  }

  @Override
  public boolean save() throws IOException {
    return databases.getDatabase1().lockableModels().save(this);
  }

  public String toString() {
    return "<LockableModel"
        + " id: " + this.getId()
        + " lock_version: " + getLockVersion()
        + " message: " + getMessage()
        + " created_at: " + getCreatedAt()
        + " updated_at: " + getUpdatedAt()
        + ">";
  }

  public void unsetAssociations() {
    unsetDatabaseReference();
  }

  public int compareTo(LockableModel that) {
    return Long.valueOf(this.getId()).compareTo(that.getId());
  }
  
  
  public static class Attributes extends AttributesWithId {
    
    public static final long serialVersionUID = 2267084843778072603L;

    // Fields
    private int __lock_version;
    private String __message;
    private long __created_at;
    private long __updated_at;

    public Attributes(long id) {
      super(id);
    }

    public Attributes(long id, final int lock_version, final String message, final long created_at, final long updated_at) {
      super(id);
      this.__lock_version = lock_version;
      this.__message = message;
      this.__created_at = created_at;
      this.__updated_at = updated_at;
    }
    
    public Attributes(long id, final int lock_version, final String message, final long updated_at) {
      super(id);
      this.__lock_version = lock_version;
      this.__message = message;
      this.__updated_at = updated_at;
      this.__created_at = System.currentTimeMillis();
    }
    
    public Attributes(long id, final int lock_version, final long created_at, final long updated_at) {
      super(id);
      this.__lock_version = lock_version;
      this.__created_at = created_at;
      this.__updated_at = updated_at;
    }
    
    public Attributes(long id, final int lock_version, final long updated_at) {
      super(id);
      this.__lock_version = lock_version;
      this.__updated_at = updated_at;
      this.__created_at = System.currentTimeMillis();
    }

    public static Attributes newDefaultInstance(long id) {
      return new Attributes(id, 0, 0L, 0L);
    }

    public Attributes(long id, Map<Enum, Object> fieldsMap) {
      super(id);
      Integer lock_version_tmp = (Integer)fieldsMap.get(LockableModel._Fields.lock_version);
      int lock_version = lock_version_tmp == null ? 0 : lock_version_tmp;
      String message = (String)fieldsMap.get(LockableModel._Fields.message);
      long created_at = (Long)fieldsMap.get(LockableModel._Fields.created_at);
      long updated_at = (Long)fieldsMap.get(LockableModel._Fields.updated_at);
      this.__lock_version = lock_version;
      this.__message = message;
      this.__created_at = created_at;
      this.__updated_at = updated_at;
    }

    public Attributes(Attributes other) {
      super(other.getId());
      this.__lock_version = other.getLockVersion();
      this.__message = other.getMessage();
      this.__created_at = other.getCreatedAt();
      this.__updated_at = other.getUpdatedAt();
    }

    public int getLockVersion() {
      return __lock_version;
    }

    public Attributes setLockVersion(int newval) {
      this.__lock_version = newval;
      cachedHashCode = 0;
      return this;
    }

    public String getMessage() {
      return __message;
    }

    public Attributes setMessage(String newval) {
      this.__message = newval;
      cachedHashCode = 0;
      return this;
    }

    public long getCreatedAt() {
      return __created_at;
    }

    public Attributes setCreatedAt(long newval) {
      this.__created_at = newval;
      cachedHashCode = 0;
      return this;
    }

    public long getUpdatedAt() {
      return __updated_at;
    }

    public Attributes setUpdatedAt(long newval) {
      this.__updated_at = newval;
      cachedHashCode = 0;
      return this;
    }

    public void setField(_Fields field, Object value) {
      switch (field) {
        case lock_version:
          setLockVersion((Integer)value);
          break;
        case message:
          setMessage((String)value);
          break;
        case created_at:
          setCreatedAt((Long)value);
          break;
        case updated_at:
          setUpdatedAt((Long)value);
          break;
        default:
          throw new IllegalStateException("Invalid field: " + field);
      }
    }

    public void setField(String fieldName, Object value) {
      if (fieldName.equals("lock_version")) {
        setLockVersion((Integer)value);
        return;
      }
      if (fieldName.equals("message")) {
        setMessage((String)value);
        return;
      }
      if (fieldName.equals("created_at")) {
        setCreatedAt((Long)value);
        return;
      }
      if (fieldName.equals("updated_at")) {
        setUpdatedAt((Long)value);
        return;
      }
      throw new IllegalStateException("Invalid field: " + fieldName);
    }

    public static Class getFieldType(_Fields field) {
      switch (field) {
        case lock_version:
          return int.class;
        case message:
          return String.class;
        case created_at:
          return long.class;
        case updated_at:
          return long.class;
        default:
          throw new IllegalStateException("Invalid field: " + field);
      }    
    }

    public static Class getFieldType(String fieldName) {    
      if (fieldName.equals("lock_version")) {
        return int.class;
      }
      if (fieldName.equals("message")) {
        return String.class;
      }
      if (fieldName.equals("created_at")) {
        return long.class;
      }
      if (fieldName.equals("updated_at")) {
        return long.class;
      }
      throw new IllegalStateException("Invalid field name: " + fieldName);
    }

    @Override
    public Object getField(String fieldName) {
      if (fieldName.equals("id")) {
        return getId();
      }
      if (fieldName.equals("lock_version")) {
        return getLockVersion();
      }
      if (fieldName.equals("message")) {
        return getMessage();
      }
      if (fieldName.equals("created_at")) {
        return getCreatedAt();
      }
      if (fieldName.equals("updated_at")) {
        return getUpdatedAt();
      }
      throw new IllegalStateException("Invalid field name: " + fieldName);
    }

    public Object getField(_Fields field) {
      switch (field) {
        case lock_version:
          return getLockVersion();
        case message:
          return getMessage();
        case created_at:
          return getCreatedAt();
        case updated_at:
          return getUpdatedAt();
      }
      throw new IllegalStateException("Invalid field: " + field);
    }

    public boolean hasField(String fieldName) {
      if (fieldName.equals("id")) {
        return true;
      }
      if (fieldName.equals("lock_version")) {
        return true;
      }
      if (fieldName.equals("message")) {
        return true;
      }
      if (fieldName.equals("created_at")) {
        return true;
      }
      if (fieldName.equals("updated_at")) {
        return true;
      }
      return false;
    }

    public static Object getDefaultValue(_Fields field) {
      switch (field) {
        case lock_version:
          return 0;
        case message:
          return null;
        case created_at:
          return null;
        case updated_at:
          return null;
      }
      throw new IllegalStateException("Invalid field: " + field);
    }
    
    @Override
    public Set<Enum> getFieldSet() {
      Set set = EnumSet.allOf(_Fields.class);
      return set;
    }
    
    public String toString() {
      return "<LockableModel.Attributes"
          + " lock_version: " + getLockVersion()
          + " message: " + getMessage()
          + " created_at: " + getCreatedAt()
          + " updated_at: " + getUpdatedAt()
          + ">";
    }
  }

  public static class Id implements ModelIdWrapper<LockableModel.Id> {
    public static final long serialVersionUID = 1L;

    private final long id;

    public Id(Long id) {
      this.id = id;
    }

    @Override
    public Long getId() {
      return id;
    }

    @Override
    public int compareTo(Id other) {
      return this.getId().compareTo(other.getId());
    }

    @Override
    public boolean equals(Object other) {
      if (other instanceof Id) {
        return this.getId().equals(((Id)other).getId());
      }
      return false;
    }

    @Override
    public int hashCode() {
      return this.getId().hashCode();
    }

    @Override
    public String toString() {
      return "<LockableModel.Id: " + this.getId() + ">";
    }
  }

  public static Set<Attributes> convertToAttributesSet(Collection<LockableModel> models) {
    return models.stream()
        .map(LockableModel::getAttributes)
        .collect(Collectors.toSet());
  }

  public static class AssociationMetadata implements IModelAssociationMetadata {

    private List<IAssociationMetadata> meta = new ArrayList<IAssociationMetadata>();

    public AssociationMetadata(){
    }

    @Override
    public List<IAssociationMetadata> getAssociationMetadata() {
      return meta;
    }
  }

}
