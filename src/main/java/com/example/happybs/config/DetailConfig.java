package com.example.happybs.config;

import com.example.happybs.model.Detail;
import com.example.happybs.service.DetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class DetailConfig {
    private final DetailService detailService;

    public void detailSeeder(){
        detailService.save(new Detail(
            null,
            "Keith Burgun",
            "CRC Press",
            2012,
            "Despite the proliferation of video games in the twenty-first century, the theory of game design is largely underdeveloped, leaving designers on their own to understand what games really are. Helping you produce better games, Game Design Theory: A New Philosophy for Understanding Games presents a bold new path for analyzing and designing games."
        ));
        detailService.save(new Detail(
            null,
            "Ulrika Jägare",
            "Wiley",
            2019,
            "Over half of all businesses are using data science to generate insights and value from big data. How are they doing it? Data Science Strategy For Dummies answers all your questions about how to build a data science capability from scratch, starting with the “what” and the “why” of data science and covering what it takes to lead and nurture a top-notch team of data scientists.%n%nWith this book, you'll learn how to incorporate data science as a strategic function into any business, large or small. Find solutions to your real-life challenges as you uncover the stories and value hidden within data.%n%nIn non-technical language, Data Science Strategy For Dummies outlines new perspectives and strategies to effectively lead analytics and data science functions to create real value."
        ));
        detailService.save(new Detail(
            null,
            "Philipp Koehn",
            "Cambridge University Press",
            2020,
            "Deep learning is revolutionizing how machine translation systems are built today. This book introduces the challenge of machine translation and evaluation - including historical, linguistic, and applied context -- then develops the core deep learning methods used for natural language applications. Code examples in Python give readers a hands-on blueprint for understanding and implementing their own machine translation systems. The book also provides extensive coverage of machine learning tricks, issues involved in handling various forms of data, model enhancements, and current challenges and methods for analysis and visualization. Summaries of the current research in the field make this a state-of-the-art textbook for undergraduate and graduate classes, as well as an essential reference for researchers and developers interested in other applications of neural methods in the broader field of human language processing."
        ));
        detailService.save(new Detail(
            null,
            "Chris Dotson",
            "O'Reilly Media",
            2019,
            "With their rapidly changing architecture and API-driven automation, cloud platforms come with unique security challenges and opportunities. This hands-on book guides you through security best practices for multivendor cloud environments, whether your company plans to move legacy on-premises projects to the cloud or build a new infrastructure from the ground up.%n%nDevelopers, IT architects, and security professionals will learn cloud-specific techniques for securing popular cloud platforms such as Amazon Web Services, Microsoft Azure, and IBM Cloud. Chris Dotson—an IBM senior technical staff member—shows you how to establish data asset management, identity and access management, vulnerability management, network security, and incident response in your cloud environment."
        ));
        detailService.save(new Detail(
            null,
            "J. C. van Vliet",
            "Cambridge University Press",
            1986,
            "This book covers all aspects of computer document preparation text processing and printing. Computers are being used increasingly in the processing of documents, from simple textual material, such as letters and memos, to complete books with mathematical formulae and graphics. The material may be extensively edited and manipulated on the computer before subsequent output on media such as typewriters, laser printers or photocomposers. This volume contains contributions from several established leaders in the field, and a number of research articles referred by an international programme committee. As such, the book gives a good impression of the state-of-the art in this area, which is of major importance in this 'electronic age' where on-line information retrieval and electronic publishing will increasingly affect our everyday life."
        ));
        detailService.save(new Detail(
            null,
            "Steve Parker",
            "Wiley",
            2011,
            "The shell is the primary way of communicating with the Unix and Linux systems, providing a direct way to program by automating simple-to-intermediate tasks. With this book, Linux expert Steve Parker shares a collection of shell scripting recipes that can be used as is or easily modified for a variety of environments or situations. The book covers shell programming, with a focus on Linux and the Bash shell; it provides credible, real-world relevance, as well as providing the flexible tools to get started immediately.%n%nShares a collection of helpful shell scripting recipes that can immediately be used for various of real-world challenges.%n%nFeatures recipes for system tools, shell features, and systems administration.%n%nProvides a host of plug and play recipes for to immediately apply and easily modify so the wheel doesn't have to be reinvented with each challenge faced.%n%nCome out of your shell and dive into this collection of tried and tested shell scripting recipes that you can start using right away!"
        ));
        detailService.save(new Detail(
            null,
            "Adnan Darwiche",
            "Cambridge University Press",
            2009,
            "This book is a thorough introduction to the formal foundations and practical applications of Bayesian networks. It provides an extensive discussion of techniques for building Bayesian networks that model real-world situations, including techniques for synthesizing models from design, learning models from data, and debugging models using sensitivity analysis. It also treats exact and approximate inference algorithms at both theoretical and practical levels. The treatment of exact algorithms covers the main inference paradigms based on elimination and conditioning and includes advanced methods for compiling Bayesian networks, time-space tradeoffs, and exploiting local structure of massively connected networks. The treatment of approximate algorithms covers the main inference paradigms based on sampling and optimization and includes influential algorithms such as importance sampling, MCMC, and belief propagation. The author assumes very little background on the covered subjects, supplying in-depth discussions for theoretically inclined readers and enough practical details to provide an algorithmic cookbook for the system developer."
        ));
        detailService.save(new Detail(
            null,
            "Peter Brass",
            "Cambridge University Press",
            2008,
            "This text closely examines ideas, analysis, and implementation details of data structures as a specialised topic in applied algorithms. It looks at efficient ways to realise query and update operations on sets of numbers, intervals, or strings by various data structures, including: search trees; structures for sets of intervals or piece-wise constant functions; orthogonal range search structures; heaps; union-find structures; dynamization and persistence of structures; structures for strings; and hash tables. Instead of relegating data structures to trivial material used to illustrate object-oriented programming methodology, this is the first volume to show data structures as a crucial algorithmic topic. Numerous code examples in C and more than 500 references make Advanced Data Structures an indispensable text."
        ));
        detailService.save(new Detail(
            null,
            "Brandon Sanderson",
            "Orion",
            2020,
            "After forming a coalition of human resistance against the enemy invasion, Dalinar Kholin and his Knights Radiant have spent a year fighting a protracted, brutal war. Neither side has gained an advantage, and the threat of a betrayal by Dalinar's crafty ally Taravangian looms over every strategic move.%n%nNow, as new technological discoveries by Navani Kholin's scholars begin to change the face of the war, the enemy prepares a bold and dangerous operation. The arms race that follows will challenge the very core of the Radiant ideals, and potentially reveal the secrets of the ancient tower that was once the heart of their strength.%n%nAt the same time that Kaladin Stormblessed must come to grips with his changing role within the Knights Radiant, his Windrunners face their own problem: As more and more deadly enemy Fused awaken to wage war, no more honorspren are willing to bond with humans to increase the number of Radiants. Adolin and Shallan must lead the coalition's envoy to the honorspren stronghold of Lasting Integrity and either convince the spren to join the cause against the evil god Odium, or personally face the storm of failure."
        ));
        detailService.save(new Detail(
            null,
            "Ben Aaronovitch",
            "Orion",
            2021,
            "It is the summer of 2013 and Abigail Kamara has been left to her own devices. This might, by those who know her, be considered a mistake. While her cousin, police constable and apprentice wizard Peter Grant, is off in the sticks, chasing unicorns, Abigail is chasing her own mystery. Teenagers around Hampstead Heath have been going missing but before the police can get fully engaged, the teens return home - unharmed but vague about where they've been.%n%nAided only by her new friend Simon, her knowledge that magic is real, and a posse of talking foxes that think they're spies, Abigail must venture into the wilds of Hampstead to discover who is luring the teenagers and more importantly - why?"
        ));
        detailService.save(new Detail(
            null,
            "Max Brooks",
            "Random House Worlds",
            2006,
            "We survived the zombie apocalypse, but how many of us are still haunted by that terrible time? We have (temporarily?) defeated the living dead, but at what cost? Told in the haunting and riveting voices of the men and women who witnessed the horror firsthand, World War Z is the only record of the pandemic.%n%nThe Zombie War came unthinkably close to eradicating humanity. Max Brooks, driven by the urgency of preserving the acid-etched first-hand experiences of the survivors, traveled across the United States of America and throughout the world, from decimated cities that once teemed with upwards of thirty million souls to the most remote and inhospitable areas of the planet. He recorded the testimony of men, women, and sometimes children who came face-to-face with the living, or at least the undead, hell of that dreadful time. World War Z is the result. Never before have we had access to a document that so powerfully conveys the depth of fear and horror, and also the ineradicable spirit of resistance, that gripped human society through the plague years."
        ));
        detailService.save(new Detail(
            null,
            "Vaseem Khan",
            "Hodder & Stoughton",
            2019,
            "In a symbolic journey of reconciliation, the Monsoon Express is travelling between hostile neighbours India and Pakistan. The passenger list includes politicians, celebrities, former Mumbai policeman Inspector Chopra and his baby elephant ward Ganesha.%n%nThen a senior diplomat is found murdered in his cabin. Accusations fly, tensions rise, and an international incident seems certain. But is the murder political - or personal?%n%nTasked to investigate, Chopra has just hours before the train reaches its destination and the news goes public. He must unmask the killer quickly if he's to stop the last journey of the Monsoon Express going entirely off the rails..."
        ));
        detailService.save(new Detail(
            null,
            "Neil Gaiman",
            "W. W. Norton & Company",
            2017,
            "Neil Gaiman, long inspired by ancient mythology in creating the fantastical realms of his fiction, presents a bravura rendition of the Norse gods and their world from their origin though their upheaval in Ragnarok.%n%nIn Norse Mythology, Gaiman stays true to the myths in envisioning the major Norse pantheon: Odin, the highest of the high, wise, daring, and cunning; Thor, Odin's son, incredibly strong yet not the wisest of gods; and Loki—son of a giant—blood brother to Odin and a trickster and unsurpassable manipulator.%n%nGaiman fashions these primeval stories into a novelistic arc that begins with the genesis of the legendary nine worlds and delves into the exploits of deities, dwarfs, and giants. Through Gaiman's deft and witty prose, these gods emerge with their fiercely competitive natures, their susceptibility to being duped and to duping others, and their tendency to let passion ignite their actions, making these long-ago myths breathe pungent life again."
        ));
        detailService.save(new Detail(
            null,
            "Amor Towles",
            "Penguin Publishing Group",
            2021,
            "In June, 1954, eighteen-year-old Emmett Watson is driven home to Nebraska by the warden of the juvenile work farm where he has just served fifteen months for involuntary manslaughter. His mother long gone, his father recently deceased, and the family farm foreclosed upon by the bank, Emmett's intention is to pick up his eight-year-old brother, Billy, and head to California where they can start their lives anew. But when the warden drives away, Emmett discovers that two friends from the work farm have hidden themselves in the trunk of the warden's car. Together, they have hatched an altogether different plan for Emmett's future, one that will take them all on a fateful journey in the opposite direction—to the City of New York.%n%nSpanning just ten days and told from multiple points of view, Towles's third novel will satisfy fans of his multi-layered literary styling while providing them an array of new and richly imagined settings, characters, and themes."
        ));
        detailService.save(new Detail(
            null,
            "Brandon Sanderson",
            "Tom Doherty Associates",
            2017,
            "Three years ago, Lift asked a goddess to stop her from growing older--a wish she believed was granted. Now, in Edgedancer, the barely teenage nascent Knight Radiant finds that time stands still for no one. Although the young Azish emperor granted her safe haven from an executioner she knows only as Darkness, court life is suffocating the free-spirited Lift, who can't help heading to Yeddaw when she hears the relentless Darkness is there hunting people like her with budding powers. The downtrodden in Yeddaw have no champion, and Lift knows she must seize this awesome responsibility."
        ));
        detailService.save(new Detail(
            null,
            "Terry Pratchett",
            "Transworld",
            2009,
            "The Discworld is very much like our own - if our own were to consist of a flat planet balanced on the back of four elephants which stand on the back of a giant turtle, that is . . .%n%n'Don't put your trust in revolutions. They always come round again. That's why they're called revolutions. People die, and nothing changes.'%n%nFor a policeman, there can be few things worse than a serial killer loose in your city. Except, perhaps, a serial killer who targets coppers, and a city on the brink of bloody revolution.%n%nFor Commander Sam Vimes, it all feels horribly familiar. Caught on the roof of a very magical building during a storm, he's found himself back in his own rough, tough past without even the clothes he was standing up in when the lightning struck. Living in the past is hard, especially when your time travel companion is a serial killer who knows where you live. But he must survive, because he has a job to do: track down the murderer and change the outcome of the rebellion.%n%n\n" +
                        "            The problem is: if he wins, he's got no wife, no child, no future..."
        ));
        detailService.save(new Detail(
            null,
            "G. Richard Shell",
            "Penguin Publishing Group",
            2006,
            "As director of the world-renowned Wharton Executive Negotiation Workshop, Professor G. Richard Shell has taught thousands of business leaders, lawyers, administrators, and other professionals how to survive and thrive in the sometimes rough-and-tumble world of negotiation. In the third edition of this internationally acclaimed book, he brings to life his systematic, step-by-step approach, built around negotiating effectively as who you are, not who you think you need to be. Shell combines lively stories about world-class negotiators from J. P. Morgan to Mahatma Gandhi with proven bargaining advice based on the latest research into negotiation and neuroscience."
        ));
        detailService.save(new Detail(
            null,
            "Eric Ries",
            "Crown",
            2011,
            "Eric Ries defines a startup as an organization dedicated to creating something new under conditions of extreme uncertainty. This is just as true for one person in a garage or a group of seasoned professionals in a Fortune 500 boardroom. What they have in common is a mission to penetrate that fog of uncertainty to discover a successful path to a sustainable business.%n%nThe Lean Startup approach fosters companies that are both more capital efficient and that leverage human creativity more effectively. Inspired by lessons from lean manufacturing, it relies on “validated learning,” rapid scientific experimentation, as well as a number of counter-intuitive practices that shorten product development cycles, measure actual progress without resorting to vanity metrics, and learn what customers really want. It enables a company to shift directions with agility, altering plans inch by inch, minute by minute.%n%nRather than wasting time creating elaborate business plans, The Lean Startup offers entrepreneurs—in companies of all sizes—a way to test their vision continuously, to adapt and adjust before it's too late. Ries provides a scientific approach to creating and managing successful startups in a age when companies need to innovate more than ever."
        ));
        detailService.save(new Detail(
            null,
            "Robert T. Kiyosaki",
            "Plata Publishing, LLC",
            2017,
            "Rich Dad Poor Dad is Robert's story of growing up with two dads his real father and the father of his best friend, his rich dad and the ways in which both men shaped his thoughts about money and investing. The book explodes the myth that you need to earn a high income to be rich and explains the difference between working for money and having your money work for you."
        ));
        detailService.save(new Detail(
            null,
            "Adam Grant",
            "Penguin Publishing Group",
            2021,
            "Intelligence is usually seen as the ability to think and learn, but in a rapidly changing world, there's another set of cognitive skills that might matter more: the ability to rethink and unlearn. In our daily lives, too many of us favor the comfort of conviction over the discomfort of doubt. We listen to opinions that make us feel good, instead of ideas that make us think hard. We see disagreement as a threat to our egos, rather than an opportunity to learn. We surround ourselves with people who agree with our conclusions, when we should be gravitating toward those who challenge our thought process. The result is that our beliefs get brittle long before our bones. We think too much like preachers defending our sacred beliefs, prosecutors proving the other side wrong, and politicians campaigning for approval--and too little like scientists searching for truth. Intelligence is no cure, and it can even be a curse: being good at thinking can make us worse at rethinking. The brighter we are, the blinder to our own limitations we can become.%n%nOrganizational psychologist Adam Grant is an expert on opening other people's minds--and our own. As Wharton's top-rated professor and the bestselling author of Originals and Give and Take, he makes it one of his guiding principles to argue like he's right but listen like he's wrong. With bold ideas and rigorous evidence, he investigates how we can embrace the joy of being wrong, bring nuance to charged conversations, and build schools, workplaces, and communities of lifelong learners. You'll learn how an international debate champion wins arguments, a Black musician persuades white supremacists to abandon hate, a vaccine whisperer convinces concerned parents to immunize their children, and Adam has coaxed Yankees fans to root for the Red Sox. Think Again reveals that we don't have to believe everything we think or internalize everything we feel. It's an invitation to let go of views that are no longer serving us well and prize mental flexibility over foolish consistency. If knowledge is power, knowing what we don't know is wisdom."
        ));
        detailService.save(new Detail(
            null,
            "James D. Gwartney",
            "St. Martin's Publishing Group",
            2016,
            "With the global economy recovering from a steep recession, and with that recovery challenging our long-held ideas about what careers and the market can be, learning the basics of economics has never been more essential. Principles such as gains from trade, the role of profit and loss, and the secondary effects of government spending, taxes, and borrowing risk continue to be critically important to the way America's economy functions, and critically important to understand for those hoping to further their professional lives - even their personal lives. Common Sense Economics discusses key points and theories, using them to show how any reader can make wiser personal choices and form more informed positions on policy.%n%nNow in its third edition, this fully updated classic from James D. Gwartney, Richard L. Stroup, Dwight R. Lee, and Tawni H. Ferrarini reflects on the recession and the progress that's been made since the crash; it offers insight into political processes and the many ways in which economics informs policy, illuminating our world and what might be done to make it better."
        ));
        detailService.save(new Detail(
            null,
            "Derek Laing",
            "W. W. Norton & Company",
            2011,
            "Labor Economics has comprehensive coverage, and gives instructors the flexibility to tailor their text precisely to the course that they want to teach. The text stresses problem solving, with several Worked Problems in each chapter, and includes leading-edge pedagogy to help students better understand and master the material."
        ));
        detailService.save(new Detail(
            null,
            "Stuart Diamond",
            "Crown",
            2010,
            "A 20% discount on an item already on sale. A four-year-old willingly brushes his/her teeth and goes to bed. A vacationing couple gets on a flight that has left the gate. $5 million more for a small business; a billion dollars at a big one.%n%nBased on thirty years of research among forty thousand people in sixty countries, Wharton Business School Professor and Pulitzer Prize winner Stuart Diamond shows in this unique and revolutionary book how emotional intelligence, perceptions, cultural diversity and collaboration produce four times as much value as old-school, conflictive, power, leverage and logic.%n%nAs negotiations underlie every human encounter, this immediately-usable advice works in virtually any situation: kids, jobs, travel, shopping, business, politics, relationships, cultures, partners, competitors.%n%nThe tools are invisible until you first see them. Then they're always there to solve your problems and meet your goals."
        ));
        detailService.save(new Detail(
            null,
            "Morgan Housel",
            "Harriman House",
            2020,
            "Doing well with money isn't necessarily about what you know. It's about how you behave. And behavior is hard to teach, even to really smart people.Money—investing, personal finance, and business decisions—is typically taught as a math-based field, where data and formulas tell us exactly what to do. But in the real world people don't make financial decisions on a spreadsheet. They make them at the dinner table, or in a meeting room, where personal history, your own unique view of the world, ego, pride, marketing, and odd incentives are scrambled together.In The Psychology of Money, award-winning author Morgan Housel shares 19 short stories exploring the strange ways people think about money and teaches you how to make better sense of one of life's most important topics."
        ));
        detailService.save(new Detail(
            null,
            "Simon Wiesenthal",
            "Knopf Doubleday Publishing Group",
            2008,
            "While imprisoned in a Nazi concentration camp, Simon Wiesenthal was taken one day from his work detail to the bedside of a dying member of the SS. Haunted by the crimes in which he had participated, the soldier wanted to confess to--and obtain absolution from--a Jew. Faced with the choice between compassion and justice, silence and truth, Wiesenthal said nothing.  But even years after the way had ended, he wondered: Had he done the right thing? What would you have done in his place?%n%nIn this important book, fifty-three distinguished men and women respond to Wiesenthal's questions. They are theologians, political leaders, writers, jurists, psychiatrists, human rights activists, Holocaust survivors, and victims of attempted genocides in Bosnia, Cambodia, China and Tibet. Their responses, as varied as their experiences of the world, remind us that Wiesenthal's questions are not limited to events of the past."
        ));
        detailService.save(new Detail(
            null,
            "Timothy Keller",
            "Penguin Publishing Group",
            2012,
            "Tim Keller, pastor of New York's Redeemer Presbyterian Church and the New York Times bestselling author of The Reason for God, has taught and counseled students, young professionals, and senior leaders on the subject of work and calling for more than twenty years. Now he pulls his insights into a thoughtful and practical book for readers everywhere.%n%nWith deep conviction and often surprising advice, Keller shows readers that biblical wisdom is immensely relevant to our questions about work today. In fact, the Christian view of work—that we work to serve others, not ourselves—can provide the foundation of a thriving professional and balanced personal life. Keller shows how excellence, integrity, discipline, creativity, and passion in the workplace can help others and even be considered acts of worship—not just of self-interest."
        ));
        detailService.save(new Detail(
            null,
            "Timothy B. Savage",
            "Cambridge University Press",
            1955,
            "Dr Savage seeks to understand the apostle Paul's apparently contradictory description of his ministry in 2 Corinthians as one in which power is manifested through weakness: 'When I am weak, then I am strong!' This paradox becomes intelligible when it is understood that Paul's critics were influenced by a perspective which was the exact opposite of his: they imbibed the self-exalting outlook of their contemporary world, while he embraced the self-emptying gospel of Christ. Drawing from archaeological data on first-century Corinth, this study is unique in establishing both the secular underpinnings of Paul's paradoxical language and the devastating critique which that language offers on the general outlook of the first century. Paul emerges as a radical foil to the spirit of the age."
        ));
        detailService.save(new Detail(
            null,
            "Fraser Watts",
            "Cambridge University Press",
            2017,
            "Psychology, Religion, and Spirituality provides readers with a critical overview of what psychology tells us about religion and spirituality. It is concise without being simplistic, and the first such broad overview to be published for some years. Fraser Watts recognizes that 'religion' is complex and multi-faceted, taking different forms in different people and contexts. The book presents a broad view of psychology; whatever kind of psychology you are interested in, you will find it covered here, from biological to social, and from experimental to psychoanalytic. It focuses particularly on the varied concepts that psychologists have employed to make sense of religion and subjects them to critical examination. The book is also concerned with practical applications, helping those engaged in religious ministry. It will be of interest to undergraduates and general readers, as well as specialists in religious studies, psychology, and philosophy of religion."
        ));
        detailService.save(new Detail(
            null,
            "James Redfield",
            "Transworld",
            2013,
            "The Celestine Prophecy contains secrets that are currently changing our world. Drawing on the ancient wisdom found in a Peruvian manuscript, it tells you how to make connections between the events happening in your own life right now...and lets you see what is going to happen to you in the years to come.%n%nThe story it tells is a gripping one of adventure and discovery, but it is also a guidebook that has the power to crystalize your perceptions of why you are where you are in life...and to direct your steps with a new energy and optimism as you head into tomorrow."
        ));
        detailService.save(new Detail(
            null,
            "Timothy Keller",
            "Penguin Publishing Group",
            2016,
            "We live in an age of skepticism. Our society places such faith in empirical reason, historical progress, and heartfelt emotion that it's easy to wonder: Why should anyone believe in Christianity? What role can faith and religion play in our modern lives?%n%nIn this thoughtful and inspiring new book, pastor and New York Times bestselling author Timothy Keller invites skeptics to consider that Christianity is more relevant now than ever. As human beings, we cannot live without meaning, satisfaction, freedom, identity, justice, and hope. Christianity provides us with unsurpassed resources to meet these needs. Written for both the ardent believer and the skeptic, Making Sense of God shines a light on the profound value and importance of Christianity in our lives."
        ));
        detailService.save(new Detail(
            null,
            "Eric Metaxas",
            "Salem Books",
            2021,
            "Is Atheism Dead? is an entertaining, impressively wide-ranging, and decidedly provocative answer to that famous 1966 TIME cover that itself provocatively asked “Is God Dead?” In a voice that is by turns witty, muscular, and poetic, Metaxas intentionally echoes C.S. Lewis and G.K. Chesterton in cheerfully and logically making his astonishing case, along the way presenting breathtaking—and often withering—new evidence and arguments against the idea of a Creatorless universe. Taken all together, he shows atheism not merely to be implausible and intellectually sloppy, but now demonstrably ridiculous. Perhaps the only unanswered question on the subject is why we couldn't see this sooner, and how embarrassed we should be about it."
        ));
        detailService.save(new Detail(
            null,
            "Taitetsu Unno",
            "The Crown Publishing Group",
            2010,
            "With great spiritual insight and unparalleled scholarship, Dr. Taitetsu Unno—the foremost authority in the United States on Shin or Pure Land Buddhism—introduces us to the most popular form of Buddhism in Japan. Unique among the various practices of Buddhism, this \"new\" form of spiritual practice is certain to enrich the growing practice of Buddhism in the United States, which is already quite familiar with Zen and Tibetan traditions. River of Fire, River of Water is an introduction to the practice of Pure Land Buddhism for readers with or without prior experience with it.%n%nThe Pure Land tradition dates back to the sixth century c.e., when Buddhism was first introduced in Japan. Unlike Zen, its counterpart which flourished in remote monasteries, the Pure Land tradition was the form of Buddhism practiced by common people. Consequently, its practice is harmonious with the workings of daily life, making it easily adaptable for seekers today. Despite the difference in method, though, the goal of Pure Land is the same as other schools—the awakening of the true self.%n%nCertain to take its place alongside great works such as Three Pillars of Zen, The Miracle of Mindfulness, and Zen Mind, Beginner's Mind—River of Fire, River of Water is an important step forward for American Buddhism."
        ));
        detailService.save(new Detail(
            null,
            "Oliver Sacks",
            "Knopf Doubleday Publishing Group",
            2017,
            "Oliver Sacks, a scientist and a storyteller, is beloved by readers for the extraordinary neurological case histories (Awakenings, An Anthropologist on Mars) in which he introduced and explored many now familiar disorders--autism, Tourette's syndrome, face blindness, savant syndrome. He was also a memoirist who wrote with honesty and humor about the remarkable and strange encounters and experiences that shaped him (Uncle Tungsten, On the Move, Gratitude). Sacks, an Oxford-educated polymath, had a deep familiarity not only with literature and medicine but with botany, animal anatomy, chemistry, the history of science, philosophy, and psychology. The River of Consciousness is one of two books Sacks was working on up to his death, and it reveals his ability to make unexpected connections, his sheer joy in knowledge, and his unceasing, timeless project to understand what makes us human."
        ));
        detailService.save(new Detail(
            null,
            "Richard Walker",
            "Cambridge University Press",
            2017,
            "Featuring detailed commented spectral profiles of more than one hundred astronomical objects, in colour, this spectral guide documents most of the important and spectroscopically observable objects accessible using typical amateur equipment. It allows you to read and interpret the recorded spectra of the main stellar classes, as well as most of the steps from protostars through to the final stages of stellar evolution as planetary nebulae, white dwarfs or the different types of supernovae. It also presents integrated spectra of stellar clusters, galaxies and quasars, and the reference spectra of some terrestrial light sources, for calibration purposes. Whether used as the principal reference for comparing with your recorded spectra or for inspiring independent observing projects, this atlas provides a breathtaking view into our Universe's past. The atlas is accompanied and supplemented by Spectroscopy for Amateur Astronomers, which explains in detail the methods for recording, processing, analysing and interpreting your spectra."
        ));
        detailService.save(new Detail(
            null,
            "Sean B. Carroll",
            "W. W. Norton & Company",
            2019,
            "A unique opportunity for students to learn biology through stories told by one of the great science storytellers of our time: Sean B. Carroll. This enriching text follows the structure of an introductory biology course, with brief chapters that span the breadth of the life sciences. This gives maximum flexibility to assign a few stories, or all of them."
        ));
        detailService.save(new Detail(
            null,
            "Josie Iselin",
            "Abrams",
            2014,
            "In her captivating new book, artist and avid beachcomber Josie Iselin returns to the seashore to reveal the unexpected beauty of seaweed. Produced on a flatbed scanner, Iselin's vibrant portraits of ocean flora reveal the exquisite color and extraordinary forms of more than 200 specimens gathered from tidal pools along the California and Maine coasts. Her engaging text, which accompanies the images, blends personal observation and philosophical musings with scientific fact. Like her previous books, An Ocean Garden: The Secret Life of Seaweed is a poetic and compelling tribute to the natural world and the wonder it evokes."
        ));
        detailService.save(new Detail(
            null,
            "Frank Hoffmann",
            "Springer International Publishing",
            2020,
            "This book invites you on a systematic tour through the fascinating world of crystals and their symmetries. The reader will gain an understanding of the symmetry of external crystal forms (morphology) and become acquainted with all the symmetry elements needed to classify and describe crystal structures. The book explains the context in a very vivid, non-mathematical way and captivates with clear, high-quality illustrations. Online materials accompany the book; including 3D models the reader can explore on screen to aid in the spatial understanding of the structure of crystals. %n%nAfter reading the book, you will not only know what a space group is and how to read the International Tables for Crystallography, but will also be able to interpret crystallographic specifications in specialist publications. If questions remain, you also have the opportunity to ask the author on the book's website."
        ));
        detailService.save(new Detail(
            null,
            "David Reich",
            "Knopf Doubleday Publishing Group",
            2018,
            "A groundbreaking book about how ancient DNA has profoundly changed our understanding of human history.%n%nGeneticists like David Reich have made astounding advances in the field of genomics, which is proving to be as important as archeology, linguistics, and written records as a means to understand our ancestry. %n%nIn Who We Are and How We Got Here, Reich allows readers to discover how the human genome provides not only all the information a human embryo needs to develop but also the hidden story of our species. Reich delves into how the genomic revolution is transforming our understanding of modern humans and how DNA studies reveal deep inequalities among different populations, between the sexes, and among individuals. Provocatively, Reich's book suggests that there might very well be biological differences among human populations but that these differences are unlikely to conform to common stereotypes.%n%nDrawing upon revolutionary findings and unparalleled scientific studies, Who We Are and How We Got Here is a captivating glimpse into humankind—where we came from and what that says about our lives today."
        ));
        detailService.save(new Detail(
            null,
            "Norman Gray",
            "Cambridge University Press",
            2022,
            "This compact yet informative Guide presents an accessible route through Special Relativity, taking a modern axiomatic and geometrical approach. It begins by explaining key concepts and introducing Einstein's postulates. The consequences of the postulates – length contraction and time dilation – are unravelled qualitatively and then quantitatively. These strands are then tied together using the mathematical framework of the Lorentz transformation, before applying these ideas to kinematics and dynamics. This volume demonstrates the essential simplicity of the core ideas of Special Relativity, while acknowledging the challenges of developing new intuitions and dealing with the apparent paradoxes that arise. A valuable supplementary resource for intermediate undergraduates, as well as independent learners with some technical background, the Guide includes numerous exercises with hints and notes provided online. It lays the foundations for further study in General Relativity, which is introduced briefly in an appendix."
        ));
        detailService.save(new Detail(
            null,
            "Marcos Mariño",
            "Cambridge University Press",
            2021,
            "Quantum mechanics is one of the most successful theories in science, and is relevant to nearly all modern topics of scientific research. This textbook moves beyond the introductory and intermediate principles of quantum mechanics frequently covered in undergraduate and graduate courses, presenting in-depth coverage of many more exciting and advanced topics. The author provides a clearly structured text for advanced students, graduates and researchers looking to deepen their knowledge of theoretical quantum mechanics. The book opens with a brief introduction covering key concepts and mathematical tools, followed by a detailed description of the Wentzel-Kramers-Brillouin (WKB) method. Two alternative formulations of quantum mechanics are then presented: Wigner's phase space formulation and Feynman's path integral formulation. The text concludes with a chapter examining metastable states and resonances. Step-by-step derivations, worked examples and physical applications are included throughout."
        ));
    }
}
