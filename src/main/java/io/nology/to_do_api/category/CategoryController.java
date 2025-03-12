// package io.nology.to_do_api.category;

// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import io.nology.to_do_api.task.CreateTaskDTO;
// import jakarta.validation.Valid;

// import java.util.List;

// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;

// @RestController
// @RequestMapping("/categories")
// public class CategoryController {

// private CategoryService categoryService;

// public CategoryController(CategoryService categoryService) {
// this.categoryService = categoryService;
// }

// @GetMapping
// public ResponseEntity<List<Category>> getAllCategories() {
// List<Category> categories = this.categoryService.getAll();
// return new ResponseEntity<>(categories, HttpStatus.OK);
// }

// @PostMapping
// public ResponseEntity<CategoryResponseDTO> createCategory(@RequestBody @Valid
// CreateCategoryDTO data) {
// CategoryResponseDTO response = categoryService.createCategory(data);
// return new ResponseEntity<>(response, HttpStatus.CREATED);
// }

// }
