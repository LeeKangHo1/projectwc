package com.metacoding.projectwc.worldcup.item;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class WorldcupItemRepository {
    private final EntityManager entityManager;

    public WorldcupItem save(WorldcupItem worldcupItem) {
        entityManager.persist(worldcupItem);
        return worldcupItem;
    }

    public List<WorldcupItem> findByWorldcupIdAndNameOrderByOption(int id, String itemname, String orderOption, int offset, int limit) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("select * from worldcup_item_tb where is_deleted = false and worldcup_id = :id".replace(":id", String.valueOf(id)));
        if (itemname != null && !itemname.isEmpty())
            stringBuilder.append(" and itemname like '%:itemname%'".replace(":itemname", itemname));
        if (orderOption != null) stringBuilder.append(" order by :orderOption".replace(":orderOption", orderOption));
        else stringBuilder.append(" order by case when total_count = 0 THEN 0 else CAST(win_count as float) / total_count end DESC, id DESC");
        stringBuilder.append(" limit :offset, :limit".replace(":offset", String.valueOf(offset)).replace(":limit", String.valueOf(limit)));
        String sql = stringBuilder.toString();
        return entityManager.createNativeQuery(sql, WorldcupItem.class).getResultList();
    }

    public int countByWorldcupIdAndNameOrderByOption(int id, String itemname) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("select count(*) from worldcup_item_tb where is_deleted = false and worldcup_id = :id".replace(":id", String.valueOf(id)));
        if (itemname != null && !itemname.isEmpty())
            stringBuilder.append(" and itemname like '%:itemname%'".replace(":itemname", itemname));
        String sql = stringBuilder.toString();
        Object singleResult = entityManager.createNativeQuery(sql).getSingleResult();
        return Integer.parseInt(singleResult.toString());
    }

    public int countAll(int id) {
        String sql = """
                select count(*) from worldcup_item_tb where worldcup_id = :id
                """.replace(":id", String.valueOf(id));
        Object singleResult = entityManager.createNativeQuery(sql)
                .getSingleResult();
        return Integer.parseInt(singleResult.toString());
    }

    public List<WorldcupItem> findByWorldcupId(int id) {
        String sql = """
                select w from WorldcupItem w WHERE w.isDeleted = false AND w.worldcup.id = :id
                """;

        return entityManager.createQuery(sql,WorldcupItem.class).setParameter("id",id).getResultList();
    }

    public List<WorldcupItem> findTwoItems(Integer id) {
        String jpql = "SELECT w FROM WorldcupItem w WHERE w.worldcup.id = :worldcupId AND w.isDeleted = false ORDER BY w.championCount DESC, w.id DESC";
        TypedQuery<WorldcupItem> query = entityManager.createQuery(jpql, WorldcupItem.class);
        query.setParameter("worldcupId", id);
        query.setMaxResults(2); // 최대 결과 수를 2개로 제한

        return query.getResultList();
    }

    public Optional<WorldcupItem> findById(int id) {
        return Optional.ofNullable(entityManager.find(WorldcupItem.class, id));
    }
}
