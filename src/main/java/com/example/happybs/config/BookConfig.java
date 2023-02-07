package com.example.happybs.config;

import com.example.happybs.model.Book;
import com.example.happybs.service.BookService;
import com.example.happybs.service.CategoryService;
import com.example.happybs.service.DetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BookConfig {
    private final BookService bookService;
    private final CategoryService categoryService;
    private final DetailService detailService;
    public void bookSeeder(){
        bookService.save(new Book(
            null,
            categoryService.get(1L),
            detailService.get(1L),
            "Game Design Theory : A New Philosophy for Understanding Games"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(1L),
            detailService.get(2L),
            "Data Science Strategy For Dummies"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(1L),
            detailService.get(3L),
            "Neural Machine Translation"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(1L),
            detailService.get(4L),
            "Practical Cloud Security : A Guide for Secure Design and Deployment"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(1L),
            detailService.get(5L),
            "Text Processing and Document Manipulation"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(1L),
            detailService.get(6L),
            "Shell Scripting"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(1L),
            detailService.get(7L),
            "Modeling and Reasoning with Bayesian Networks"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(1L),
            detailService.get(8L),
            "Advanced Data Structures"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(2L),
            detailService.get(9L),
            "Rhythm of War"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(2L),
            detailService.get(10L),
            "What Abigail Did That Summer"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(2L),
            detailService.get(11L),
            "World War Z : An Oral History of the Zombie War"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(2L),
            detailService.get(12L),
            "Last Victim of the Monsoon Express"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(2L),
            detailService.get(13L),
            "Norse Mythology"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(2L),
            detailService.get(14L),
            "The Lincoln Highway"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(2L),
            detailService.get(15L),
            "Edgedancer"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(2L),
            detailService.get(16L),
            "Night Watch"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(3L),
            detailService.get(17L),
            "Bargaining for Advantage"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(3L),
            detailService.get(18L),
            "The Lean Startup"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(3L),
            detailService.get(19L),
            "Rich Dad Poor Dad"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(3L),
            detailService.get(20L),
            "Think Again : The Power of Knowing What You Don't Know"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(3L),
            detailService.get(21L),
            "Common Sense Economics : What Everyone Should Know About Wealth and Prosperity"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(3L),
            detailService.get(22L),
            "Labor Economics : Introduction to Classic and the New Labor Economics"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(3L),
            detailService.get(23L),
            "Getting More : How You Can Negotiate to Succeed in Work and Life"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(3L),
            detailService.get(24L),
            "The Psychology of Money : Timeless lessons on wealth, greed, and happiness"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(4L),
            detailService.get(25L),
            "The Sunflower : On the Possibilities and Limits of Forgiveness"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(4L),
            detailService.get(26L),
            "Every Good Endeavor : Connecting Your Work to God's Work"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(4L),
            detailService.get(27L),
            "Power through Weakness"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(4L),
            detailService.get(28L),
            "Psychology, Religion, and Spirituality : Concepts and Applications"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(4L),
            detailService.get(29L),
            "The Celestine Prophecy"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(4L),
            detailService.get(30L),
            "Making Sense of God : Finding God in the Modern World"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(4L),
            detailService.get(31L),
            "Is Atheism Dead?"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(4L),
            detailService.get(32L),
            "River of Fire, River of Water"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(5L),
            detailService.get(33L),
            "The River of Consciousness"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(5L),
            detailService.get(34L),
            "Spectral Atlas for Amateur Astronomers"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(5L),
            detailService.get(35L),
            "The Story of Life : Great Discoveries in Biology"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(5L),
            detailService.get(36L),
            "An Ocean Garden : The Secret Life of Seaweed"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(5L),
            detailService.get(37L),
            "Introduction to Crystallography"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(5L),
            detailService.get(38L),
            "Who We Are and How We Got Here"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(5L),
            detailService.get(39L),
            "A Student's Guide to Special Relativity"
        ));
        bookService.save(new Book(
            null,
            categoryService.get(5L),
            detailService.get(40L),
            "Advanced Topics in Quantum Mechanics"
        ));
    }
}
