package in.zenify.zenifyclient.models;

/**
 * Created by trapti on 3/20/16.
 */
public class UserAssociation {
    private String id;
    private UserType userType;
    private String userId;
    private EntityType entityType;
    private String entityId;
    private UserRoleType role;

    public UserAssociation() {
    }

    public UserAssociation(UserType userType, String userId, EntityType entityType, String entityId, UserRoleType role) {
        this.userType = userType;
        this.userId = userId;
        this.entityType = entityType;
        this.entityId = entityId;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public UserRoleType getRole() {
        return role;
    }

    public void setRole(UserRoleType role) {
        this.role = role;
    }
}
