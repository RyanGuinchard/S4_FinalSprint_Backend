package com.keyin.Sprint_Backend;

import com.keyin.Sprint_Backend.entities.Category;
import com.keyin.Sprint_Backend.entities.Game;
import com.keyin.Sprint_Backend.entities.Option;
import com.keyin.Sprint_Backend.repositories.CategoryRepository;
import com.keyin.Sprint_Backend.repositories.GameRepository;
import com.keyin.Sprint_Backend.repositories.OptionRepository;
import com.keyin.Sprint_Backend.services.CategoryService;
import com.keyin.Sprint_Backend.services.GameService;
import com.keyin.Sprint_Backend.services.OptionService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
	
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class SprintBackendApplicationTests {

	@Mock
    private CategoryRepository categoryRepository;

    @Mock
    private GameRepository gameRepository;

    @Mock
    private OptionRepository optionRepository;

    @InjectMocks
    private CategoryService categoryService;

    @InjectMocks
    private GameService gameService;

    @InjectMocks
    private OptionService optionService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    // CategoryService tests:
    @Test
    void testGetCategoriesByGameId() {
        Long gameId = 1L;
        List<Category> categories = Arrays.asList(new Category(), new Category());
        when(categoryRepository.findByGameId(gameId)).thenReturn(categories);

        List<Category> result = categoryService.getCategoriesByGameId(gameId);
        assertEquals(2, result.size());
        verify(categoryRepository, times(1)).findByGameId(gameId);
    }

    @Test
    void testSaveCategory() {
        Category category = new Category();
        when(categoryRepository.save(category)).thenReturn(category);

        Category result = categoryService.saveCategory(category);
        assertNotNull(result);
        verify(categoryRepository, times(1)).save(category);
    }

    @Test
    void testDeleteCategory() {
        Long categoryId = 1L;
        doNothing().when(categoryRepository).deleteById(categoryId);

        categoryService.deleteCategory(categoryId);
        verify(categoryRepository, times(1)).deleteById(categoryId);
    }

    // GameService tests:
    @Test
    void testGetAllGames() {
        List<Game> games = Arrays.asList(new Game(), new Game());
        when(gameRepository.findAll()).thenReturn(games);

        List<Game> result = gameService.getAllGames();
        assertEquals(2, result.size());
        verify(gameRepository, times(1)).findAll();
    }

    @Test
    void testGetGameById() {
        Long gameId = 1L;
        Game game = new Game();
        when(gameRepository.findById(gameId)).thenReturn(Optional.of(game));

        Game result = gameService.getGameById(gameId);
        assertNotNull(result);
        verify(gameRepository, times(1)).findById(gameId);
    }

    @Test
    void testSaveGame() {
        Game game = new Game();
        when(gameRepository.save(game)).thenReturn(game);

        Game result = gameService.saveGame(game);
        assertNotNull(result);
        verify(gameRepository, times(1)).save(game);
    }

    @Test
    void testDeleteGame() {
        Long gameId = 1L;
        doNothing().when(gameRepository).deleteById(gameId);

        gameService.deleteGame(gameId);
        verify(gameRepository, times(1)).deleteById(gameId);
    }

    // OptionService tests:
    @Test
    void testGetOptionsByCategoryId() {
        Long categoryId = 1L;
        List<Option> options = Arrays.asList(new Option(), new Option());
        when(optionRepository.findByCategoryId(categoryId)).thenReturn(options);

        List<Option> result = optionService.getOptionsByCategoryId(categoryId);
        assertEquals(2, result.size());
        verify(optionRepository, times(1)).findByCategoryId(categoryId);
    }

    @Test
    void testSaveOption() {
        Option option = new Option();
        when(optionRepository.save(option)).thenReturn(option);

        Option result = optionService.saveOption(option);
        assertNotNull(result);
        verify(optionRepository, times(1)).save(option);
    }

    @Test
    void testDeleteOption() {
        Long optionId = 1L;
        doNothing().when(optionRepository).deleteById(optionId);

        optionService.deleteOption(optionId);
        verify(optionRepository, times(1)).deleteById(optionId);
    }
}
