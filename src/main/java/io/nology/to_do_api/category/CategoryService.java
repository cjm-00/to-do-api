// package io.nology.to_do_api.category;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// @Service
// public class CategoryService {

// @Autowired
// private CategoryRepository repo;

// public CategoryService(CategoryRepository repo) {
// this.repo = repo;
// }

// public List<Category> getAll() {
// return this.repo.findAll();
// }

// public Optional<Category> getById(Long id) {
// return this.repo.findById(id);
// }

// public Category createCategory(CreateCategoryDTO data) {
// Category newCategory = new Category();
// newCategory.setCategory(data.getCategory().trim());
// return this.repo.save(newCategory);
// }
// }
