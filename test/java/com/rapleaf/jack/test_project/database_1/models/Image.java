
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

public class Image extends ModelWithId<Image, IDatabases> implements Comparable<Image>{
  
  public static final long serialVersionUID = -3351451520429699622L;

  public static class Tbl extends AbstractTable<Image.Attributes, Image> {
    public final Column<Long> ID;
    public final Column<Integer> USER_ID;

    private Tbl(String alias) {
      super("images", alias, Image.Attributes.class, Image.class);
      this.ID = Column.fromId(alias);
      this.USER_ID = Column.fromField(alias, _Fields.user_id, Integer.class);
      Collections.addAll(this.allColumns, ID, USER_ID);
    }

    public static Tbl as(String alias) {
      return new Tbl(alias);
    }
  }

  public static final Tbl TBL = new Tbl("images");
  public static final Column<Long> ID = TBL.ID;
  public static final Column<Integer> USER_ID = TBL.USER_ID;

  private final Attributes attributes;

  private transient Image.Id cachedTypedId;

  // Associations
  private BelongsToAssociation<User> __assoc_user;

  public enum _Fields {
    user_id,
  }

  @Override
  public Image.Id getTypedId() {
    if (cachedTypedId == null) {
      cachedTypedId = new Image.Id(this.getId());
    }
    return cachedTypedId;
  }

  public Image(long id, final Integer user_id, IDatabases databases) {
    super(databases);
    attributes = new Attributes(id, user_id);
    this.__assoc_user = new BelongsToAssociation<User>(databases.getDatabase1().users(), getUserId() == null ? null : getUserId().longValue());
  }

  public Image(long id, final Integer user_id) {
    super(null);
    attributes = new Attributes(id, user_id);
  }
  
  public Image(long id, IDatabases databases) {
    super(databases);
    attributes = new Attributes(id);
    this.__assoc_user = new BelongsToAssociation<User>(databases.getDatabase1().users(), getUserId() == null ? null : getUserId().longValue());
  }

  public Image(long id) {
    super(null);
    attributes = new Attributes(id);
  }

  public static Image newDefaultInstance(long id) {
    return new Image(id);
  }

  public Image(Attributes attributes, IDatabases databases) {
    super(databases);
    this.attributes = attributes;

    if (databases != null) {
      this.__assoc_user = new BelongsToAssociation<User>(databases.getDatabase1().users(), getUserId() == null ? null : getUserId().longValue());
    }
  }

  public Image(Attributes attributes) {
    this(attributes, (IDatabases) null);
  }

  public Image(long id, Map<Enum, Object> fieldsMap) {
    super(null);
    attributes = new Attributes(id, fieldsMap);
  }

  public Image (Image other) {
    this(other, (IDatabases)null);
  }

  public Image (Image other, IDatabases databases) {
    super(databases);
    attributes = new Attributes(other.getAttributes());

    if (databases != null) {
      this.__assoc_user = new BelongsToAssociation<User>(databases.getDatabase1().users(), getUserId() == null ? null : getUserId().longValue());
    }
  }

  public Attributes getAttributes() {
    return attributes;
  }

  public Integer getUserId() {
    return attributes.getUserId();
  }

  public Image setUserId(Integer newval) {
    attributes.setUserId(newval);
    if(__assoc_user != null){
      this.__assoc_user.setOwnerId(newval);
    }
    cachedHashCode = 0;
    return this;
  }

  public void setField(_Fields field, Object value) {
    switch (field) {
      case user_id:
        setUserId((Integer)value);
        break;
      default:
        throw new IllegalStateException("Invalid field: " + field);
    }
  }
  
  public void setField(String fieldName, Object value) {
    if (fieldName.equals("user_id")) {
      setUserId((Integer)  value);
      return;
    }
    throw new IllegalStateException("Invalid field: " + fieldName);
  }

  public static Class getFieldType(_Fields field) {
    switch (field) {
      case user_id:
        return Integer.class;
      default:
        throw new IllegalStateException("Invalid field: " + field);
    }    
  }

  public static Class getFieldType(String fieldName) {    
    if (fieldName.equals("user_id")) {
      return Integer.class;
    }
    throw new IllegalStateException("Invalid field name: " + fieldName);
  }

  public User getUser() throws IOException {
    return __assoc_user.get();
  }

  @Override
  public Object getField(String fieldName) {
    if (fieldName.equals("id")) {
      return getId();
    }
    if (fieldName.equals("user_id")) {
      return getUserId();
    }
    throw new IllegalStateException("Invalid field name: " + fieldName);
  }

  public Object getField(_Fields field) {
    switch (field) {
      case user_id:
        return getUserId();
    }
    throw new IllegalStateException("Invalid field: " + field);
  }

  public boolean hasField(String fieldName) {
    if (fieldName.equals("id")) {
      return true;
    }
    if (fieldName.equals("user_id")) {
      return true;
    }
    return false;
  }

  public static Object getDefaultValue(_Fields field) {
    switch (field) {
      case user_id:
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
  public Image getCopy() {
    return getCopy(databases);
  }

  @Override
  public Image getCopy(IDatabases databases) {
    return new Image(this, databases);
  }

  @Override
  public boolean save() throws IOException {
    return databases.getDatabase1().images().save(this);
  }

  public User createUser(final String handle, final int num_posts) throws IOException {
 
    User newUser = databases.getDatabase1().users().create(handle, num_posts);
    setUserId(JackUtility.safeLongToInt(newUser.getId()));
    save();
    __assoc_user.clearCache();
    return newUser;
  }

  public User createUser(final String handle, final Long created_at_millis, final int num_posts, final Long some_date, final Long some_datetime, final String bio, final byte[] some_binary, final Double some_float, final Double some_decimal, final Boolean some_boolean) throws IOException {
 
    User newUser = databases.getDatabase1().users().create(handle, created_at_millis, num_posts, some_date, some_datetime, bio, some_binary, some_float, some_decimal, some_boolean);
    setUserId(JackUtility.safeLongToInt(newUser.getId()));
    save();
    __assoc_user.clearCache();
    return newUser;
  }

  public User createUser() throws IOException {
 
    User newUser = databases.getDatabase1().users().create("", 0);
    setUserId(JackUtility.safeLongToInt(newUser.getId()));
    save();
    __assoc_user.clearCache();
    return newUser;
  }

  public String toString() {
    return "<Image"
        + " id: " + this.getId()
        + " user_id: " + getUserId()
        + ">";
  }

  public void unsetAssociations() {
    unsetDatabaseReference();
    __assoc_user = null;
  }

  public int compareTo(Image that) {
    return Long.valueOf(this.getId()).compareTo(that.getId());
  }
  
  
  public static class Attributes extends AttributesWithId {
    
    public static final long serialVersionUID = 5384617403533794948L;

    // Fields
    private Integer __user_id;

    public Attributes(long id) {
      super(id);
    }

    public Attributes(long id, final Integer user_id) {
      super(id);
      this.__user_id = user_id;
    }

    public static Attributes newDefaultInstance(long id) {
      return new Attributes(id);
    }

    public Attributes(long id, Map<Enum, Object> fieldsMap) {
      super(id);
      Integer user_id = (Integer)fieldsMap.get(Image._Fields.user_id);
      this.__user_id = user_id;
    }

    public Attributes(Attributes other) {
      super(other.getId());
      this.__user_id = other.getUserId();
    }

    public Integer getUserId() {
      return __user_id;
    }

    public Attributes setUserId(Integer newval) {
      this.__user_id = newval;
      cachedHashCode = 0;
      return this;
    }

    public void setField(_Fields field, Object value) {
      switch (field) {
        case user_id:
          setUserId((Integer)value);
          break;
        default:
          throw new IllegalStateException("Invalid field: " + field);
      }
    }

    public void setField(String fieldName, Object value) {
      if (fieldName.equals("user_id")) {
        setUserId((Integer)value);
        return;
      }
      throw new IllegalStateException("Invalid field: " + fieldName);
    }

    public static Class getFieldType(_Fields field) {
      switch (field) {
        case user_id:
          return Integer.class;
        default:
          throw new IllegalStateException("Invalid field: " + field);
      }    
    }

    public static Class getFieldType(String fieldName) {    
      if (fieldName.equals("user_id")) {
        return Integer.class;
      }
      throw new IllegalStateException("Invalid field name: " + fieldName);
    }

    @Override
    public Object getField(String fieldName) {
      if (fieldName.equals("id")) {
        return getId();
      }
      if (fieldName.equals("user_id")) {
        return getUserId();
      }
      throw new IllegalStateException("Invalid field name: " + fieldName);
    }

    public Object getField(_Fields field) {
      switch (field) {
        case user_id:
          return getUserId();
      }
      throw new IllegalStateException("Invalid field: " + field);
    }

    public boolean hasField(String fieldName) {
      if (fieldName.equals("id")) {
        return true;
      }
      if (fieldName.equals("user_id")) {
        return true;
      }
      return false;
    }

    public static Object getDefaultValue(_Fields field) {
      switch (field) {
        case user_id:
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
      return "<Image.Attributes"
          + " user_id: " + getUserId()
          + ">";
    }
  }

  public static class Id implements ModelIdWrapper<Image.Id> {
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
      return "<Image.Id: " + this.getId() + ">";
    }
  }

  public static Set<Attributes> convertToAttributesSet(Collection<Image> models) {
    return models.stream()
        .map(Image::getAttributes)
        .collect(Collectors.toSet());
  }

  public static class AssociationMetadata implements IModelAssociationMetadata {

    private List<IAssociationMetadata> meta = new ArrayList<IAssociationMetadata>();

    public AssociationMetadata(){
      meta.add(new DefaultAssociationMetadata(AssociationType.BELONGS_TO, Image.class, User.class, "user_id"));
    }

    @Override
    public List<IAssociationMetadata> getAssociationMetadata() {
      return meta;
    }
  }

}
