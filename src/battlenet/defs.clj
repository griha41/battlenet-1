(ns battlenet.defs)

;
; URL templates and paths
;
(def bn-baseurl         "https://{region}.battle.net/api/{game}{path}?{params}")
(def bn-path-realm      "/realm/status")
(def bn-path-character  "/character/{realm}/{name}")
(def bn-path-guild      "/guild/{realm}/{name}")
(def bn-path-perks      "/data/guild/perks")
(def bn-path-rewards    "/data/guild/rewards")
(def bn-path-classes    "/data/character/classes")
(def bn-path-races      "/data/character/races")
(def bn-path-item       "/item/{id}")
(def bn-media-icon
  "http://{region}.media.blizzard.com/{game}/icons/{size}/{icon}.jpg")
(def bn-media-avatar
  "http://{region}.battle.net/static-render/{region}/{thumbnail}")

(def bn-game-wow "wow")

;
; additional fields for character lookups
;
(def bn-fields
  {:all "all",
   :stats "stats", :talents "talents", :items "items",
   :reputation "reputation", :titles "titles", :professions "professions",
   :appearance "appearance", :companions "companions", :mounts "mounts",
   :guild "guild", :quests "quests", :pets "pets",
   :progression "progression", :achievements "achievements"})

;
; WoW classes
;
(def bn-classes
  {1 "Warrior",
   2 "Paladin",
   3 "Hunter",
   4 "Rogue",
   5 "Priest",
   6 "Death Knight",
   7 "Shaman",
   8 "Mage",
   9 "Warlock",
   11 "Druid"})

;
; WoW races
;
(def bn-races
  {1 "Human",
   2 "Orc",
   3 "Dwarf",
   4 "Night Elf",
   5 "Undead",
   6 "Tauren",
   7 "Gnome",
   8 "Troll",
   9 "Goblin",
   10 "Blood Elf",
   11 "Draenei",
   22 "Worgen"})

(def bn-genders
  {0 "Male",
   1 "Female"})

;
; WoW quality
;

(def bn-quality
  {1 "Common",
   2 "Uncommon",
   3 "Rare",
   4 "Epic",
   5 "Legendary"})

;
; WoW factions
;
(def bn-factions
  {0 "Alliance",
   1 "Horde"})

;
; WoW races to factions mapping
;
(def bn-races-factions
  {1 "Alliance",
   2 "Horde",
   3 "Alliance",
   4 "Alliance",
   5 "Horde"
   6 "Horde",
   7 "Alliance",
   8 "Horde",
   9 "Horde",
   10 "Horde",
   11 "Alliance",
   22 "Alliance"})

;
; WoW standings
;
(def bn-reputation-standing
  {0 "Hated",
   1 "Hostile",
   2 "Unfriendly",
   3 "Neutral",
   4 "Friendly",
   5 "Honored",
   6 "Revered",
   7 "Exalted"})

;
; WoW InventorySlotId/InventoryType
;
(def bn-inventory
  ["Ammo" "Head" "Neck" "Shoulder" "Shirt" "Chest"
   "Belt" "Legs" "Feet" "Wrist" "Gloves"
   "Finger" "Finger" "Trinket" "Trinket" "Back"
   "Main Hand" "Off Hand" "Ranged" "Tabard"])

;
; WoW stats
;
(def bn-stats
  {3 "Agility",
   4 "Strength",
   5 "Intellect",
   6 "Spirit",
   7 "Stamina",
   13 "Dodge",
   14 "Parry",
   31 "Hit",
   32 "Crit",
   35 "Resilience",
   36 "Haste",
   37 "Expertise",
   45 "Spell Power",
   49 "Mastery"})