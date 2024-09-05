package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.ProductDto;
import dto.ProductListDto;
import model.Product;
import repository.ProductRepository;

@Service
public class ProductService {
	private final ProductRepository productRepository;
	
	@Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
	
	public ProductListDto getProductsList() throws Exception{
			List<Product> productos = productRepository.findAll();
			return new ProductListDto(productos);
	}
	
	public ProductDto getProductById(Long id) throws Exception{
		Product product = productRepository.findById(id).orElseThrow(() -> new Exception("Error buscando producto por id"));
		return product.toDto();
	}

	public ProductDto addProduct(ProductDto productDto) {
		Product product = productDto.toEntity();
		productRepository.save(product);
		return product.toDto();
	}
}
