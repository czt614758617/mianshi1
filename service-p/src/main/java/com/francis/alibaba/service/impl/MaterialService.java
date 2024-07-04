package com.francis.alibaba.service.impl;
import com.francis.alibaba.dao.MaterialRepository;
import com.francis.alibaba.dto.MaterialDTO;
import com.francis.alibaba.entity.Material;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class MaterialService {
    @Resource
    private MaterialRepository materialRepository;

    public List<Material> querySpecificationByUserAndMaterial(String createUser, String name) {
        return materialRepository.findAll((Specification<Material>) (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (StringUtils.hasText(createUser)) {
                predicates.add(criteriaBuilder.equal(root.get("createUser"), createUser));
            }

            if (StringUtils.hasText(name)) {
                predicates.add(criteriaBuilder.like(root.get("name"), "%" + name + "%"));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        });
    }


    /**
     * 第一题和第三题答案
     * @param createUser
     * @param name
     * @return
     */
    public List<MaterialDTO> question1And3(String createUser, String name){
        List<Material> materials = querySpecificationByUserAndMaterial("user1", "item1");
        return materials.stream().map(m->{
            MaterialDTO materialDTO = new MaterialDTO();
            materialDTO.setName(m.getName());
            materialDTO.setId(m.getId());
            materialDTO.setUser(m.getUser());
            materialDTO.setCreateUser(m.getCreateUser());
            return materialDTO;
        }).collect(Collectors.toList());
    }

}
