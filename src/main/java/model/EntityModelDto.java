package model;

public class EntityModelDto extends ObjectAbstractDto {

    private EntityCategoryDto entityCategoryDto;

    public EntityModelDto() {}

    public EntityModelDto(int id, String name, EntityCategoryDto entityCategoryDto) {
        super(name, id);
        this.entityCategoryDto = entityCategoryDto;
    }

    public EntityCategoryDto getEntityCategoryDto() {
        return entityCategoryDto;
    }

    public void setEntityCategoryDto(EntityCategoryDto entityCategoryDto) {
        this.entityCategoryDto = entityCategoryDto;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof EntityModelDto)) {
            return false;
        }

        EntityModelDto diferentModel = (EntityModelDto) object;
        return super.equals(object) && entityCategoryDto.equals(diferentModel.entityCategoryDto);
    }
}