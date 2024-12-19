package com.tyj.Eccormerce.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

//@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Response {

    private int status;
    private String message;
    //@Builder.Default
    private LocalDateTime timestamp = LocalDateTime.now();

    private String token;
    private String role;
    private String expirationTime;

    private int totalPage;
    private long totalElement;

    private AddressDto address;

    private UserDto user;
    private List<UserDto> userList;

    private CategoryDto category;
    private List<CategoryDto> categoryList;

    private ProductDto product;
    private List<ProductDto> productList;

    private OrderItemDto orderItem;
    private List<OrderItemDto> orderItemList;

    private OrderDto order;
    private List<OrderDto> orderList;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public long getTotalElement() {
        return totalElement;
    }

    public void setTotalElement(long totalElement) {
        this.totalElement = totalElement;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public List<UserDto> getUserList() {
        return userList;
    }

    public void setUserList(List<UserDto> userList) {
        this.userList = userList;
    }

    public CategoryDto getCategory() {
        return category;
    }

    public void setCategory(CategoryDto category) {
        this.category = category;
    }

    public List<CategoryDto> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<CategoryDto> categoryList) {
        this.categoryList = categoryList;
    }

    public ProductDto getProduct() {
        return product;
    }

    public void setProduct(ProductDto product) {
        this.product = product;
    }

    public List<ProductDto> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductDto> productList) {
        this.productList = productList;
    }

    public OrderItemDto getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItemDto orderItem) {
        this.orderItem = orderItem;
    }

    public List<OrderItemDto> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItemDto> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public OrderDto getOrder() {
        return order;
    }

    public void setOrder(OrderDto order) {
        this.order = order;
    }

    public List<OrderDto> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderDto> orderList) {
        this.orderList = orderList;
    }

    public static class ResponseBuilder {
        private int status;
        private String message;
        private LocalDateTime timestamp = LocalDateTime.now();
        private String token;
        private String role;
        private String expirationTime;
        private int totalPage;
        private long totalElement;
        private AddressDto address;
        private UserDto user;
        private List<UserDto> userList;
        private CategoryDto category;
        private List<CategoryDto> categoryList;
        private ProductDto product;
        private List<ProductDto> productList;
        private OrderItemDto orderItem;
        private List<OrderItemDto> orderItemList;
        private OrderDto order;
        private List<OrderDto> orderList;

        public ResponseBuilder status(int status) {
            this.status = status;
            return this;
        }

        public ResponseBuilder message(String message) {
            this.message = message;
            return this;
        }

        public ResponseBuilder token(String token) {
            this.token = token;
            return this;
        }

        public ResponseBuilder role(String role) {
            this.role = role;
            return this;
        }

        public ResponseBuilder expirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        public ResponseBuilder totalPage(int totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ResponseBuilder totalElement(long totalElement) {
            this.totalElement = totalElement;
            return this;
        }

        public ResponseBuilder address(AddressDto address) {
            this.address = address;
            return this;
        }

        public ResponseBuilder user(UserDto user) {
            this.user = user;
            return this;
        }

        public ResponseBuilder userList(List<UserDto> userList) {
            this.userList = userList;
            return this;
        }

        public ResponseBuilder category(CategoryDto category) {
            this.category = category;
            return this;
        }

        public ResponseBuilder categoryList(List<CategoryDto> categoryList) {
            this.categoryList = categoryList;
            return this;
        }

        public ResponseBuilder product(ProductDto product) {
            this.product = product;
            return this;
        }

        public ResponseBuilder productList(List<ProductDto> productList) {
            this.productList = productList;
            return this;
        }

        public ResponseBuilder orderItem(OrderItemDto orderItem) {
            this.orderItem = orderItem;
            return this;
        }

        public ResponseBuilder orderItemList(List<OrderItemDto> orderItemList) {
            this.orderItemList = orderItemList;
            return this;
        }

        public ResponseBuilder order(OrderDto order) {
            this.order = order;
            return this;
        }

        public ResponseBuilder orderList(List<OrderDto> orderList) {
            this.orderList = orderList;
            return this;
        }

        public Response build() {
            Response response = new Response();
            response.setStatus(this.status);
            response.setMessage(this.message);
            response.setTimestamp(this.timestamp);
            response.setToken(this.token);
            response.setRole(this.role);
            response.setExpirationTime(this.expirationTime);
            response.setTotalPage(this.totalPage);
            response.setTotalElement(this.totalElement);
            response.setAddress(this.address);
            response.setUser(this.user);
            response.setUserList(this.userList);
            response.setCategory(this.category);
            response.setCategoryList(this.categoryList);
            response.setProduct(this.product);
            response.setProductList(this.productList);
            response.setOrderItem(this.orderItem);
            response.setOrderItemList(this.orderItemList);
            response.setOrder(this.order);
            response.setOrderList(this.orderList);
            return response;
        }
    }

    // Static method to get builder instance
    public static ResponseBuilder builder() {
        return new ResponseBuilder();
    }
}
