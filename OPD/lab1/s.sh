chmod -Rf 700 lab0 2>/dev/null
rm -Rf lab0 2>/dev/null
mkdir lab0
cd lab0
mkdir burmy4 galvantula7 mudkip3
touch ivysaur2 patrat0 stunky2
echo "РЎРїРѕСЃРѕР±РЅРѕСЃС‚Рё Tackle Growl Leech Seed Vine Whip \
	Poisonpowder Sleep Powder Take Down Razor Leaf Sweet Scent Growth \
	Double-Edge Worry Seed Synthesis Seed Bomb" > ivysaur2
echo  "satr=4 sdef=4 spd=4" > patrat0
echo  "РўРёРї РґРёРµС‚С‹ Herbivore" > stunky2
cd burmy4
	mkdir marill rapidash
	touch graveler
	echo "Р Р°Р·РІРёС‚С‹Рµ СЃРїРѕСЃРѕР±РЅРѕСЃС‚Рё Sand Veil" > graveler
	cd ../
		
cd galvantula7
	touch leavanny sharpedo
	mkdir gothitelle sawbuck
	echo  "РҐРѕРґС‹ Bug Bity!= \
		Electroweb False Swipe+ Giga Drain Heal Bell Helping Hand Iron Defense \
		Knock Off Magic Coat Seed Bomb Signal Beam Sleep Talk Snore Synthesis \
		Worry Seed" > leavanny
	echo "Р Р°Р·РІРёС‚С‹Рµ СЃРїРѕСЃРѕР±РЅРѕСЃС‚Рё Speed \
		Boost " > sharpedo
	cd ../
cd mudkip3
	touch kabutops hitmonchan
	mkdir nidoranM ferrothorn aridos houndoom
	echo "РҐРѕРґС‹ Absorb \
		Ancientpower Aqua Tail Body Slam Brine Dive Double-Edge Earth Power \
		Feint fury Cutter Giga Drain Icy Wind Iron Defense Knock Off Low Kick \
		Mega Kick Mud-Slap Rollout Seismic Toss Sleep Talk Snore Stealth Rock \
		Superpower Water Pulse" > kabutops
	echo "РўРёРї РїРѕРєРµРјРѕРЅР° FIGHTING \
		NONE" >  hitmonchan
	cd ../
chmod u=rx burmy4
chmod g=x burmy4
chmod o=w burmy4
chmod u=rwx burmy4/marill
chmod g=rwx burmy4/marill
chmod o=rwx burmy4/marill
chmod u=rw burmy4/graveler
chmod g=w burmy4/graveler
chmod o=x burmy4/graveler
chmod u=rwx burmy4/rapidash
chmod g=rx burmy4/rapidash
chmod o=wx burmy4/rapidash
chmod 535 galvantula7
chmod 006 galvantula7/leavanny
chmod 031 galvantula7/sharpedo
chmod u=wx galvantula7/gothitelle
chmod go=x galvantula7/gothitelle
chmod 577 galvantula7/sawbuck
chmod ugo=rw ivysaur2
chmod 330 mudkip3
chmod u-rw mudkip3/kabutops
chmod g+w mudkip3/kabutops
chmod 761 mudkip3/nidoranM
chmod 704 mudkip3/ferrothorn
chmod g=rw mudkip3/ferrothorn
chmod ugo+wx mudkip3/aridos
chmod g+r mudkip3/aridos
chmod 440 mudkip3/hitmonchan
chmod 757 mudkip3/houndoom
chmod u-w patrat0
chmod o-r patrat0
chmod 666 stunky2
chmod ugo+r galvantula7/gothitelle galvantula7/sharpedo galvantula7/leavanny
chmod u+w mudkip3/kabutops
chmod 770 mudkip3
cp -Ra galvantula7 mudkip3/ferrothorn
cp -a patrat0 mudkip3/aridos
ln patrat0 mudkip3/kabutopspatrat
chmod 770 mudkip3/kabutopspatrat
ln -s mudkip3 Copy_88
cd mudkip3
ln -s ../stunky2 hitmonchanstunky
cd ../
cat patrat0 > mudkip3/kabutopspatrat
cat galvantula7/sharpedo mudkip3/hitmonchan > ivysaur2_16
chmod u-w mudkip3/kabutops

wc -l burmy4/graveler galvantula7/leavanny galvantula7/sharpedo mudkip3/kabutops 2>/tmp/errors4.1 | sort -nr
echo 4.1^---------------------
cd ../
ls -lR lab0 2>/dev/null | grep "/g" | sort -k 2 | head -n 2
cd lab0
echo 4.2^---------------------
cat -n galvantula7/sharpedo mudkip3/kabutops 2>/dev/null | sort -rk 2
echo 4.3^---------------------
grep -in 'd$' ivysaur2 2>/dev/null
cd ../
echo 4.4^---------------------
cd lab0
ls -l $(grep -irl 'do') 
echo 4.5^---------------------4.6%
ls -R mudkip3 | sort



chmod 330 mudkip3
chmod ugo-r galvantula7/gothitelle galvantula7/sharpedo galvantula7/leavanny
chmod -Rf 700 mudkip3 2>/dev/null
rm patrat0
rm -f mudkip3/hitmonchan
rm -f mudkip3/hitmonchanstun*
rm -f mudkip3/kabutopspatr*
rm -rf mudkip3/ferrothorn
rm -rf mudkip3


