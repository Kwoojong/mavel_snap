package com.marvel.snap.service;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CardServiceTest {

//    @Autowired
//    private CardService cardService;
//
//    @Autowired
//    private CardRepository cardRepository;
//
//    @BeforeEach
//    void clean() {
//        cardRepository.deleteAll();
//    }
//
//    @Test
//    @DisplayName("카드 등록시 저장되는지 테스트")
//    void test1() {
//        // given
//        CardCreate aero = CardCreate.builder()
//                .korName("에어로")
//                .engName("aero")
//                .power(8)
//                .cost(5)
//                .series(3)
//                .build();
//
//        // when
//        cardService.saveCard(aero);
//
//        // then
//        assertEquals(1L , cardRepository.count());
//        Card card = cardRepository.findAll().get(0);
//        assertEquals("에어로", card.getKorName());
//        assertEquals(8, card.getPower());
//        assertEquals(5, card.getCost());
//        assertEquals(3, card.getSeries());
//    }
//
//    @Test
//    @DisplayName("카드 등록 191장")
//    void test3() {
//        // given
//        cardService.register();
//
//        List<Card> cards = cardRepository.findAll();
//
//        assertEquals(191, cards.size());
//    }
//
//    @Test
//    @DisplayName("동일 카드 중복으로 저장시 한개만 저장되는지 테스트")
//    void test4() {
//        // given
//        CardCreate aero = CardCreate.builder()
//                .korName("에어로")
//                .engName("aero")
//                .power(8)
//                .cost(5)
//                .series(3)
//                .build();
//
//        CardCreate aero2 = CardCreate.builder()
//                .korName("에어로")
//                .engName("aero")
//                .power(8)
//                .cost(5)
//                .series(3)
//                .build();
//
//        // when
//        cardService.saveCard(aero);
//        cardService.saveCard(aero2);
//
//        // then
//        assertEquals(1L , cardRepository.count());
//    }
}