```html
<!DOCTYPE html>
<html lang="ar" dir="rtl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>رحلتي وإنجازاتي 🎀</title>
    <!-- Tailwind CSS -->
    <script src="https://cdn.tailwindcss.com"></script>
    <!-- Font Awesome Icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <!-- Google Fonts - Cairo & Tajawal -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Tajawal:wght@400;500;700;800&display=swap" rel="stylesheet">
    <!-- Canvas Confetti Library -->
    <script src="https://cdn.jsdelivr.net/npm/canvas-confetti@1.6.0/dist/confetti.browser.min.js"></script>
    <script>
        tailwind.config = {
            theme: {
                extend: {
                    colors: {
                        pastelPink: '#FFD1DC',
                        deepPink: '#FF85A1',
                        lavender: '#E6E6FA',
                        deepLavender: '#9B82CF',
                        softWhite: '#FFF9FB',
                        accentGold: '#FFD700',
                    },
                    fontFamily: {
                        tajawal: ['Tajawal', 'sans-serif'],
                    }
                }
            }
        }
    </script>
    <style>
        body {
            font-family: 'Tajawal', sans-serif;
            background: linear-gradient(135deg, #FFF0F5 0%, #F3E5F5 100%);
            min-height: 100vh;
            user-select: none;
        }

        /* Floating Animation */
        @keyframes float {
            0% { transform: translateY(0px) rotate(0deg); }
            50% { transform: translateY(-8px) rotate(3deg); }
            100% { transform: translateY(0px) rotate(0deg); }
        }
        .animate-float {
            animation: float 4s ease-in-out infinite;
        }

        /* Pulsing Glow */
        @keyframes pulseGlow {
            0%, 100% { box-shadow: 0 0 15px rgba(255, 133, 161, 0.4); }
            50% { box-shadow: 0 0 25px rgba(255, 133, 161, 0.8); }
        }
        .pulse-glow {
            animation: pulseGlow 2.5s infinite;
        }

        /* Custom Scrollbar */
        ::-webkit-scrollbar {
            width: 6px;
        }
        ::-webkit-scrollbar-track {
            background: #FFF0F5;
        }
        ::-webkit-scrollbar-thumb {
            background: #FFB6C1;
            border-radius: 10px;
        }

        /* Glassmorphism Effect */
        .glass-card {
            background: rgba(255, 255, 255, 0.85);
            backdrop-filter: blur(10px);
            border: 1px solid rgba(255, 182, 193, 0.3);
        }

        /* Gray square grayscale effect */
        .completed-card {
            background: linear-gradient(135deg, #FFB6C1 0%, #D8BFD8 100%);
            border-color: #FF85A1;
        }
        
        .uncompleted-card {
            background: #F0F0F0;
            border-color: #E0E0E0;
            color: #757575;
        }
    </style>
</head>
<body class="text-gray-800 pb-20 md:pb-10">

    <!-- Header Navigation -->
    <header class="sticky top-0 z-30 glass-card shadow-sm px-4 py-3 mb-6">
        <div class="max-w-4xl mx-auto flex justify-between items-center">
            <div class="flex items-center space-x-2 space-x-reverse">
                <span class="text-2xl animate-float">🎀</span>
                <h1 class="text-xl md:text-2xl font-bold text-pink-600 tracking-wide">رحلتي وإنجازاتي</h1>
            </div>
            
            <nav class="flex space-x-2 space-x-reverse text-xs md:text-sm font-medium">
                <button onclick="switchTab('home')" id="tab-home" class="tab-btn px-3 py-1.5 rounded-full bg-pink-500 text-white shadow-md transition-all flex items-center gap-1">
                    <i class="fa-solid fa-house"></i>
                    <span>الرئيسية</span>
                </button>
                <button onclick="switchTab('rewards')" id="tab-rewards" class="tab-btn px-3 py-1.5 rounded-full bg-white text-pink-600 hover:bg-pink-100 transition-all flex items-center gap-1">
                    <i class="fa-solid fa-gift"></i>
                    <span>مكافآتي 🌸</span>
                </button>
                <button onclick="switchTab('settings')" id="tab-settings" class="tab-btn px-3 py-1.5 rounded-full bg-white text-pink-600 hover:bg-pink-100 transition-all flex items-center gap-1">
                    <i class="fa-solid fa-gear"></i>
                    <span>الإعدادات</span>
                </button>
            </nav>
        </div>
    </header>

    <!-- Main Container -->
    <main class="max-w-4xl mx-auto px-4">

        <!-- TAB 1: HOME PAGE (Grid & Dashboard) -->
        <div id="view-home" class="tab-content space-y-6">

            <!-- Welcome & Personal Goal Card -->
            <div class="glass-card rounded-3xl p-5 shadow-sm relative overflow-hidden">
                <div class="absolute top-2 left-2 text-3xl opacity-20">✨</div>
                <div class="absolute bottom-2 right-2 text-3xl opacity-20">🌸</div>
                
                <div class="flex flex-col md:flex-row justify-between items-center gap-4">
                    <div class="w-full md:w-2/3">
                        <div class="flex items-center gap-2 mb-1">
                            <h2 class="text-lg font-bold text-pink-600">هدف العناية بنفسي 💖</h2>
                            <button onclick="editPersonalGoal()" class="text-xs text-purple-500 hover:underline">
                                <i class="fa-solid fa-pen"></i> تعديل
                            </button>
                        </div>
                        <p id="display-goal" class="text-gray-700 bg-pink-50/60 p-3 rounded-2xl border border-pink-100 text-sm md:text-base leading-relaxed">
                            تطوير عاداتي الصحية، الاستمتاع بوقتي، والعناية بجسدي وروحي بكل حب ولطف 🌷
                        </p>
                    </div>

                    <!-- Optional Weight Tracking -->
                    <div class="w-full md:w-1/3 bg-purple-50/60 p-3.5 rounded-2xl border border-purple-100 text-center">
                        <div class="flex justify-between items-center mb-1">
                            <span class="text-xs font-semibold text-purple-700">متابعة الوزن (اختياري) ⚖️</span>
                            <button onclick="editWeightModal()" class="text-xs text-purple-500 hover:underline">تعديل</button>
                        </div>
                        <div class="flex justify-around items-center text-sm">
                            <div>
                                <span class="block text-xs text-gray-500">الوزن الحالي</span>
                                <span id="display-current-weight" class="font-bold text-pink-600 text-base">84</span> <span class="text-xs">كجم</span>
                            </div>
                            <div class="text-xs text-purple-300">➔</div>
                            <div>
                                <span class="block text-xs text-gray-500">الهدف</span>
                                <span id="display-target-weight" class="font-bold text-purple-600 text-base">54</span> <span class="text-xs">كجم</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Progress Summary Card -->
            <div class="glass-card rounded-3xl p-5 shadow-sm text-center relative">
                <div class="flex justify-between items-center mb-2">
                    <span class="text-xs font-bold text-pink-600 flex items-center gap-1">
                        <i class="fa-solid fa-sparkles"></i> نسبة الإنجاز والتألق
                    </span>
                    <span id="progress-text" class="text-xs font-bold text-purple-600 bg-purple-100 px-2.5 py-1 rounded-full">
                        0 / 30 مكتمل
                    </span>
                </div>

                <!-- Progress Bar -->
                <div class="w-full bg-gray-200 h-5 rounded-full overflow-hidden p-0.5 border border-pink-200 shadow-inner">
                    <div id="progress-bar" class="bg-gradient-to-r from-pink-400 to-purple-500 h-full rounded-full transition-all duration-700 ease-out flex items-center justify-end px-2" style="width: 0%">
                        <span id="progress-percentage" class="text-[10px] text-white font-bold">0%</span>
                    </div>
                </div>

                <div class="grid grid-cols-2 gap-3 mt-4 text-xs font-medium">
                    <div class="bg-pink-100/60 p-2.5 rounded-2xl flex items-center justify-center gap-2 text-pink-700">
                        <i class="fa-solid fa-circle-check text-base"></i>
                        <span>المكتملة: <strong id="count-completed" class="text-sm">0</strong></span>
                    </div>
                    <div class="bg-purple-100/60 p-2.5 rounded-2xl flex items-center justify-center gap-2 text-purple-700">
                        <i class="fa-solid fa-hourglass-half text-base"></i>
                        <span>المتبقية: <strong id="count-remaining" class="text-sm">30</strong></span>
                    </div>
                </div>
            </div>

            <!-- Motivational Banner -->
            <div class="bg-gradient-to-r from-pink-100 via-purple-100 to-pink-100 p-3 rounded-2xl text-center text-xs text-pink-700 font-medium shadow-sm flex items-center justify-center gap-2">
                <span>🎀</span>
                <span>كل خطوة صغيرة تخطينها اليوم هي احتفال بنفسك! استمتعي بمكافأتك.</span>
                <span>✨</span>
            </div>

            <!-- Action Buttons for Grid -->
            <div class="flex justify-between items-center px-1">
                <h3 class="text-base font-bold text-gray-700 flex items-center gap-1.5">
                    <i class="fa-solid fa-border-all text-pink-500"></i>
                    جدول الإنجازات والمكافآت (30)
                </h3>
                <button onclick="addNewSquare()" class="text-xs bg-pink-100 text-pink-600 hover:bg-pink-200 px-3 py-1.5 rounded-full font-bold transition-all shadow-sm flex items-center gap-1">
                    <i class="fa-solid fa-plus"></i> إضافة مربع
                </button>
            </div>

            <!-- Grid of Squares -->
            <div id="squares-grid" class="grid grid-cols-3 sm:grid-cols-4 md:grid-cols-5 lg:grid-cols-6 gap-3.5">
                <!-- Squares will be injected dynamically -->
            </div>
        </div>

        <!-- TAB 2: MY REWARDS (Unlocked Rewards & History) -->
        <div id="view-rewards" class="tab-content hidden space-y-6">
            <div class="glass-card rounded-3xl p-6 shadow-sm">
                <div class="text-center mb-6">
                    <span class="text-4xl animate-float inline-block mb-2">🎁</span>
                    <h2 class="text-xl font-bold text-pink-600">خزانة مكافآتي الجميلة</h2>
                    <p class="text-xs text-gray-500 mt-1">هنا تجدين كل المكافآت التي فتحتها بإنجازاتك ولطفك مع نفسك 🌸</p>
                </div>

                <div id="unlocked-rewards-list" class="space-y-3">
                    <!-- Dynamic List of Unlocked Rewards -->
                </div>
            </div>
        </div>

        <!-- TAB 3: SETTINGS & BACKUP -->
        <div id="view-settings" class="tab-content hidden space-y-6">
            <div class="glass-card rounded-3xl p-6 shadow-sm space-y-6">
                <div>
                    <h2 class="text-lg font-bold text-pink-600 mb-1 flex items-center gap-2">
                        <i class="fa-solid fa-sliders"></i> إدارة البيانات والنسخ الاحتياطي
                    </h2>
                    <p class="text-xs text-gray-500">بياناتك محفوظة تلقائياً في جهازك الشخصي بكل أمان 🔒</p>
                </div>

                <div class="space-y-3 pt-2">
                    <button onclick="exportData()" class="w-full py-3 px-4 bg-purple-100 text-purple-700 hover:bg-purple-200 font-bold rounded-2xl text-xs sm:text-sm transition-all flex items-center justify-center gap-2">
                        <i class="fa-solid fa-download"></i>
                        تحميل نسخة احتياطية من بياناتي (تصدير JSON)
                    </button>

                    <label class="w-full py-3 px-4 bg-pink-100 text-pink-700 hover:bg-pink-200 font-bold rounded-2xl text-xs sm:text-sm transition-all flex items-center justify-center gap-2 cursor-pointer">
                        <i class="fa-solid fa-upload"></i>
                        <span>استعادة بيانات سابقة (استيراد JSON)</span>
                        <input type="file" id="import-file" accept=".json" class="hidden" onchange="importData(event)">
                    </label>

                    <hr class="border-gray-200 my-4">

                    <button onclick="confirmResetAll()" class="w-full py-3 px-4 bg-red-50 text-red-500 hover:bg-red-100 font-bold rounded-2xl text-xs sm:text-sm transition-all flex items-center justify-center gap-2">
                        <i class="fa-solid fa-rotate-left"></i>
                        إعادة تعيين كافة المربعات والبيانات (بدء من جديد)
                    </button>
                </div>
            </div>

            <!-- Encouragement Philosophy Card -->
            <div class="bg-white/70 rounded-3xl p-5 border border-pink-100 text-xs leading-relaxed text-gray-600 space-y-2">
                <h4 class="font-bold text-pink-600 text-sm flex items-center gap-1">
                    <i class="fa-solid fa-heart text-pink-400"></i> فلسفة رحلتك:
                </h4>
                <p>هذا التطبيق صُمم ليكون مساحتك الآمنة والممتعة. الهدف ليس الكمال أو ملاحقة أرقام محددة بل الاحتفال بالعناية بالذات والأهداف الصحية والنفسية. خذي استراحتك متى أردتِ واستمتعي بمكافآتك بدون أي شعور بالذنب! 🌸✨</p>
            </div>
        </div>

    </main>

    <!-- MODAL: Square Details & Action -->
    <div id="square-modal" class="fixed inset-0 bg-black/40 backdrop-blur-sm z-50 flex items-center justify-center p-4 hidden">
        <div class="bg-white rounded-3xl max-w-sm w-full p-6 shadow-2xl space-y-4 relative animate-scaleUp">
            <button onclick="closeModal('square-modal')" class="absolute top-4 left-4 text-gray-400 hover:text-gray-600 text-lg">
                <i class="fa-solid fa-xmark"></i>
            </button>

            <div class="text-center">
                <span id="modal-square-icon" class="text-4xl inline-block mb-1">🎀</span>
                <h3 id="modal-square-title" class="text-xl font-extrabold text-pink-600">مربع رقم #1</h3>
                <span id="modal-status-badge" class="inline-block mt-1 text-[11px] px-3 py-0.5 rounded-full font-bold">
                    غير مكتمل ☁️
                </span>
            </div>

            <!-- Reward Display / Edit Section -->
            <div class="bg-pink-50/80 rounded-2xl p-3.5 border border-pink-100">
                <div class="flex justify-between items-center mb-1">
                    <span class="text-xs font-bold text-gray-500">المكافأة المخصصة:</span>
                    <button onclick="toggleEditRewardInput()" class="text-xs text-pink-600 hover:underline">
                        <i class="fa-solid fa-pen-to-square"></i> تعديل
                    </button>
                </div>
                <p id="modal-reward-text" class="text-sm font-bold text-pink-700 leading-snug">
                    الرقص على أغنيتي المفضلة للمتعة 🎵
                </p>
                <div id="reward-edit-box" class="hidden mt-2 space-y-2">
                    <input type="text" id="reward-input" class="w-full text-xs p-2 rounded-xl border border-pink-300 focus:outline-none focus:ring-2 focus:ring-pink-400" placeholder="اكتبي مكافأتك الجديدة...">
                    <button onclick="saveRewardEdit()" class="w-full text-xs bg-pink-500 text-white py-1.5 rounded-xl font-bold">حفظ المكافأة</button>
                </div>
            </div>

            <!-- Note Input -->
            <div>
                <label class="block text-xs font-bold text-gray-600 mb-1">إضافة ملاحظة عن إنجازك (اختياري) 📝</label>
                <input type="text" id="modal-note-input" class="w-full text-xs p-2.5 rounded-xl bg-gray-50 border border-gray-200 focus:outline-none focus:ring-2 focus:ring-purple-300" placeholder="مثال: شعرتُ بطاقة إيجابية رائعة اليوم!">
            </div>

            <!-- Question & Actions -->
            <div class="pt-2 text-center space-y-2">
                <p class="text-xs font-bold text-purple-700">هل أنجزتِ هذا المربع اليوم؟ 🌸</p>
                <div class="grid grid-cols-2 gap-2">
                    <button onclick="markSquareStatus(true)" class="bg-gradient-to-r from-pink-400 to-pink-500 hover:from-pink-500 hover:to-pink-600 text-white font-bold text-xs sm:text-sm py-2.5 px-3 rounded-2xl shadow-md transition-all active:scale-95 flex items-center justify-center gap-1">
                        <span>إيه، أنجزته! 🌸</span>
                    </button>
                    <button onclick="markSquareStatus(false)" class="bg-gray-100 hover:bg-gray-200 text-gray-600 font-bold text-xs sm:text-sm py-2.5 px-3 rounded-2xl transition-all active:scale-95">
                        <span>ليس بعد ☁️</span>
                    </button>
                </div>
            </div>

            <!-- Delete Square Button -->
            <div class="text-center pt-1">
                <button onclick="deleteCurrentSquare()" class="text-[11px] text-red-400 hover:text-red-600 hover:underline">
                    <i class="fa-solid fa-trash-can"></i> حذف هذا المربع
                </button>
            </div>
        </div>
    </div>

    <!-- MODAL: Encouragement Celebration Popup -->
    <div id="encouragement-modal" class="fixed inset-0 bg-black/40 backdrop-blur-sm z-50 flex items-center justify-center p-4 hidden">
        <div class="bg-white rounded-3xl max-w-sm w-full p-6 shadow-2xl text-center space-y-4 animate-scaleUp border-2 border-pink-300">
            <div class="text-5xl animate-bounce">🎉</div>
            <h3 class="text-xl font-extrabold text-pink-600">فخورة بكِ جداً! 💕</h3>
            <p id="encouragement-message" class="text-sm text-gray-700 bg-pink-50 p-3 rounded-2xl leading-relaxed">
                أحسنتِ! خصصتِ وقتًا لنفسك اليوم 🎀
            </p>
            <div class="bg-purple-50 p-3 rounded-2xl border border-purple-100">
                <span class="text-xs text-purple-600 font-bold block mb-1">مكافأتك المكتسبة الان ✨</span>
                <span id="encouragement-reward" class="text-xs font-bold text-pink-600">---</span>
            </div>
            <button onclick="closeModal('encouragement-modal')" class="w-full py-2.5 bg-gradient-to-r from-pink-400 to-purple-500 text-white rounded-2xl font-bold text-sm shadow-md">
                استمتعي بلقطتك السعيدة! 🌸
            </button>
        </div>
    </div>

    <!-- MODAL: Personal Goal Edit -->
    <div id="goal-modal" class="fixed inset-0 bg-black/40 backdrop-blur-sm z-50 flex items-center justify-center p-4 hidden">
        <div class="bg-white rounded-3xl max-w-sm w-full p-5 shadow-2xl space-y-3">
            <h3 class="text-base font-bold text-pink-600 flex items-center gap-1.5">
                <i class="fa-solid fa-pen-heart"></i> تعديل الهدف الشخصي
            </h3>
            <textarea id="goal-input-text" rows="3" class="w-full text-xs p-3 rounded-2xl border border-pink-200 focus:outline-none focus:ring-2 focus:ring-pink-400" placeholder="اكتبي هدفك الخاص اللطيف..."></textarea>
            <div class="flex justify-end gap-2">
                <button onclick="closeModal('goal-modal')" class="px-3 py-1.5 text-xs text-gray-500 bg-gray-100 rounded-xl">إلغاء</button>
                <button onclick="savePerso