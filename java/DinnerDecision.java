import java.util.Scanner;

public class DinnerDecision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("今晚晚飯決定助手開始！請根據提示回答。");

        // 問題 1: 心情
        System.out.print("你今天心情不錯嗎？(是/否): ");
        String mood = scanner.nextLine().trim();

        // 問題 2: 氣溫
        System.out.print("今天氣溫很冷嗎？(是/否): ");
        String temperature = scanner.nextLine().trim();

        // 問題 3: 穿著
        System.out.print("你穿著厚重嗎？(是/否): ");
        String clothing = scanner.nextLine().trim();

        // 問題 4: 幸運數字
        System.out.print("請輸入你的幸運數字: ");
        int luckyNumber = scanner.nextInt();
        scanner.nextLine(); // 清除緩衝區中的換行符

        String luckyNumberType = (luckyNumber % 2 == 0) ? "偶數" : "奇數";


        // 根據回答組合不同的選項
        if (mood.equalsIgnoreCase("是")) {
            if (temperature.equalsIgnoreCase("是")) {
                if (clothing.equalsIgnoreCase("是")) {
                    // 心情好，天氣冷，穿著厚重
                    System.out.println("推薦：");
                    if (luckyNumberType.equals("奇數")) {
                        System.out.println("1. 小羚火鍋，熱騰騰的，讓你感到溫暖！");
                        System.out.println("2. 牛筋伯爵，幸福感滿滿！");
                    } else {
                        System.out.println("1. 粥公，清淡又溫暖！");
                        System.out.println("2. ㄎㄎ韓食，濃郁又飽滿！");
                    }
                } else {
                    // 心情好，天氣冷，穿著輕便
                    System.out.println("推薦：");
                    if (luckyNumberType.equals("奇數")) {
                        System.out.println("1. 翅炸鍋，暖伙又舒適！");
                        System.out.println("2. 八方雲集，熱量滿分，讓你有活力！");
                    } else {
                        System.out.println("1. 地中海，濃郁的口感，讓你滿足！");
                        System.out.println("2. 阿湯哥，脆皮與多汁的完美結合！");
                    }
                }
            } else {
                if (clothing.equalsIgnoreCase("是")) {
                    // 心情好，天氣不冷，穿著厚重
                    System.out.println("推薦：");
                    if (luckyNumberType.equals("奇數")) {
                        System.out.println("1. a咖，享受熱氣騰騰的肉類！");
                        System.out.println("2. Simple fit，清爽又健康！");
                    } else {
                        System.out.println("1. 小羚火鍋，暖心又暖胃！");
                        System.out.println("2. 六妹，方便又舒適！");
                    }
                } else {
                    // 心情好，天氣不冷，穿著輕便
                    System.out.println("推薦：");
                    if (luckyNumberType.equals("奇數")) {
                        System.out.println("1. 蔬芙，清新又健康！");
                        System.out.println("2. 食凡，清爽的選擇！");
                    } else {
                        System.out.println("1. 薩克廚房，精緻又美味！");
                        System.out.println("2. 渝香園，提升幸福感！");
                    }
                }
            }
        } else {
            if (temperature.equalsIgnoreCase("是")) {
                if (clothing.equalsIgnoreCase("是")) {
                    // 心情不好，天氣冷，穿著厚重
                    System.out.println("推薦：");
                    if (luckyNumberType.equals("奇數")) {
                        System.out.println("1. 翅炸鍋，溫暖又有安慰感！");
                        System.out.println("2. 食凡，帶來好心情！");
                    } else {
                        System.out.println("1. 薩克廚房，濃郁暖心！");
                        System.out.println("2. 阿湯哥，簡單又治癒！");
                    }
                } else {
                    // 心情不好，天氣冷，穿著輕便
                    System.out.println("推薦：");
                    if (luckyNumberType.equals("奇數")) {
                        System.out.println("1. 薩克廚房，熱氣騰騰，讓你放鬆！");
                        System.out.println("2. 中正雞場，熱量補充，帶來快樂！");
                    } else {
                        System.out.println("1. 豪記滷味，濃郁香氣撫慰心靈！");
                        System.out.println("2. 蘭姐手工水餃，簡單又飽腹！");
                    }
                }
            } else {
                if (clothing.equalsIgnoreCase("是")) {
                    // 心情不好，天氣不冷，穿著厚重
                    System.out.println("推薦：");
                    if (luckyNumberType.equals("奇數")) {
                        System.out.println("1. 即時樂，輕食又精緻！");
                        System.out.println("2. 榕樹下，濃郁口味讓你滿足！");
                    } else {
                        System.out.println("1. 富成屋拉麵，湯頭濃厚令人放鬆！");
                        System.out.println("2. 中正雞場，酥脆多汁，絕佳享受！");
                    }
                } else {
                    // 心情不好，天氣不冷，穿著輕便
                    System.out.println("推薦：");
                    if (luckyNumberType.equals("奇數")) {
                        System.out.println("1. 農閒時刻，治癒一切！");
                        System.out.println("2. 錢伯鹽水雞，快速又簡單！");
                    } else {
                        System.out.println("1. 仙草奶酪，溫暖人心！");
                        System.out.println("2. 蔬芙，清爽又健康！");
                    }
                }
            }
        }

        scanner.close();
    }
}
